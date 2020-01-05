public class Scheduler {
    /* Attributes */
    private static Scheduler scheduler;

    /* Constructor */
    private Scheduler() {

    }

    /* Singleton Instance Method */
    public static Scheduler getInstance() {

        if (null == scheduler) {

            scheduler = new Scheduler();
        }

        return scheduler;
    }

    /* Methods */
    public void scheduleJob(Match match) {
        System.out.println("Job has been Scheduled!");
    }

    public void notify(Match match) {
        System.out.println("The Requester and the Responder has been Notified!");
    }
}