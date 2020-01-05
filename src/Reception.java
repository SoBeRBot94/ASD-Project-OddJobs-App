/* Imports */

import java.util.ArrayList;
import java.util.List;

/* Class Declaration */
public class Reception {
    /* Attributes */
    private static Reception reception;
    public List<Request> requestList;

    /* Constructor */
    private Reception() {
        requestList = new ArrayList<Request>();
    }

    /* Singleton Instance Method */
    public static Reception getInstance() {

        if (null == reception) {

            reception = new Reception();
        }

        return reception;
    }

    /* Methods */
    public void receiveRequest(Request request) {
        requestList.add(request);
    }

    public void updateDB() {
        Database.getInstance().saveRequest(requestList);
    }
}
