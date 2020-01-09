/* Imports */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Class Declaration */
public class Request {
    /* Attributes */
    public double jobID;
    public static double serialNO = 0;
    public String jobTitle;
    public String jobDescription;
    public long bid;
    public long wage;
    public Date date;
    public String status;
    public List<Tracker> trackers;

    /* Constructor */
    public Request(String jobTitle, String jobDescription, long bid, long wage, Date date, String status) {
        this.jobID = Request.serialNO++;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.bid = bid;
        this.wage = wage;
        this.date = date;
        this.status = status;
        Logger.getInstance().logRequest(this);
        Reception.getInstance().receiveRequest(this);
        trackers = new ArrayList<Tracker>();
    }

    /* Observable Methods */
    public void addObserver(Tracker tracker) {
        if (tracker != null) {
            this.trackers.add(tracker);
        }
        else if(tracker == null) {
           Tracker _tracker = new Tracker(this);
            this.trackers.add(_tracker);
        }
    }

    public void notifyObservers() {
        for (Tracker tracker : trackers) {
            tracker.update(this);
        }
    }

    public void removeObserver(Tracker tracker) {
        if (tracker != null) {
            this.trackers.remove(tracker);
        }
    }

    /* Methods */
    public boolean editRequest(Request this) {
        return false;
    }

    public boolean cancelRequest(Request this) {
        return false;
    }

    public boolean updateRequestStatus(String status) {
        return false;
    }
}