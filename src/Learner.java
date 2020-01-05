/* Imports */

import java.util.ArrayList;
import java.util.List;

public class Learner {
    /* Attributes */
    public List<Request> requests;

    /* Constructor */
    public Learner() {

    }

    /* Methods */
    public void fetchRequest() {
        requests = Database.getInstance().getRequestList();
    }

    public List<Responder> returnProspects() {
        // Fetch Feedback, Preferences, Constraints, Users from the Database, Perform some action to return a list of Prospects
        return new ArrayList<Responder>();
    }

    public void forwardRequest() {
        List<Responder> responders = returnProspects();
        for (Request request : requests) {
            Matcher matcher = new Matcher(responders, request);
        }
    }

}
