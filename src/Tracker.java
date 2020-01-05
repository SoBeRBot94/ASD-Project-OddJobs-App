public class Tracker {
    /* Attributes */
    public Request request;

    /* Constructor */
    public Tracker(Request request) {
        this.request = request;
    }

    /* Methods */
    public void update(Request request) {
        System.out.println("Request has been updated!");
    }

    public String showRequestStatus(Request request) {
        return request.status;
    }

    public void updateStatusinDB(Request request) {
        Database.getInstance().updateRequestStatus(request);
    }
}