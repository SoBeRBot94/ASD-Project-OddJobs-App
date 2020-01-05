/* Imports */

import java.util.ArrayList;
import java.util.List;

/* Class Declaration */
public class Database {
    /* Attributes */
    private static Database database;

    /* Constructor */
    private Database() {

    }

    /* Singleton Instance Method */
    public static Database getInstance() {

        if (null == database) {
            database = new Database();
        }

        return database;

    }

    /* Methods */
    public void saveUserDetails(User user) {
        System.out.println("User Details Saved!");
    }

    public void savePreferences(Preferences preferences) {
        System.out.println("Preferences Saved!");
    }

    public void saveConstraints(Constraints constraints) {
        System.out.println("Constraints Saved!");
    }

    public void saveFeedback(Feedback feedback) {
        System.out.println("Feedback Saved!");
    }

    public void saveRequest(List<Request> requestList) {
        System.out.println("Request Saved!");
    }

    public void updateRequestStatus(Request request) {
        System.out.println("Running the update Query!");
    }

    public List<Request> getRequestList() {
        return new ArrayList<Request>();
    }
}
