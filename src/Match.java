public class Match {
    /* Attributes */
    public Request request;
    public Requester requester;
    public Responder responder;

    /* Constructors */
    public Match(Request request, Requester requester, Responder responder) {
        this.request = request;
        this.requester = requester;
        this.responder = responder;
    }

    public Match() {

    }
}
