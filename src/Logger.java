public class Logger {
    /* Attributes */
    private static Logger logger;

    /* Constructor */
    private Logger() {

    }

    /* Singleton Instance Method */
    public static Logger getInstance() {

        if (null == logger) {
            logger = new Logger();
        }

        return logger;

    }

    /* Methods */
    public void logRequest(Request request) {
        System.out.println("Logging Request!");
    }

    public void logMatch(Match match) {
        System.out.println("Logging Match!");
    }
}
