/* Imports */

import java.util.ArrayList;
import java.util.List;

public class Learner {
    /* Attributes */
    public List<Request> requests;
    public List<Feedback> feedbackList;
    public List<Constraints> constraintsList;
    public List<Preferences> preferencesList;
    /* Constructor */
    public Learner() {

    }

    /* Methods */
    public void fetchRequest() {
        requests = Database.getInstance().getRequestList();
    }

    public void fetchFeedback() { feedbackList = Database.getInstance().getFeedbackList(); }

    public void fetchConstraints() { constraintsList = Database.getInstance().getConstraintsList(); }

    public void fetchPreferences() {
        preferencesList = Database.getInstance().getPreferencesList();
    }

    public List<Responder> returnProspects(List<Request> requests, List<Feedback> feedbackList, List<Constraints> constraintsList, List<Preferences> preferencesList) {
        // Fetch Feedback, Preferences, Constraints, Users from the Database, Perform some action to return a list of Prospects
        return new ArrayList<Responder>();
    }

    public void forwardRequest() {
        List<Responder> responders = returnProspects(requests, feedbackList, constraintsList, preferencesList);
        for (Request request : requests) {
            Matcher matcher = new Matcher(responders, request);
        }
    }
}
