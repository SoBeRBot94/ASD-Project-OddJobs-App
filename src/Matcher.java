/* Imports */

import java.util.List;

public class Matcher {
    /* Attributes */
    public List<Responder> responderList;
    public Request request;

    /* Constructor */
    public Matcher(List<Responder> responderList, Request request) {
        this.responderList = responderList;
        this.request = request;
    }

    /* Methods */
    public Match performMatch() {
        // Return a match based on the request and the list of candidate responders
        return new Match();
    }

    public boolean askForResponse(Match match) {
        return false;
    }

    public boolean forwardMatch(Match match) {
        Scheduler.getInstance().scheduleJob(match);
        return false;
    }
}
