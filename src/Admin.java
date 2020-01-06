public class Admin {
    /* Attributes */
    private static Admin admin;
    public String userName;
    public String email;
    public String password;

    /* Constructor */
    private Admin(String userName, String email, String password) {
        this.userName = userName;
        this.email = email;
        this.password = password;
    }

    /* Singleton Instance Method */
    public static Admin getInstance(String userName, String email, String password) {

        if (null == admin) {
            admin = new Admin(userName, email, password);
        }

        return admin;

    }

    /* Methods */
    public boolean login(String userName, String password) {
    	return false;
    }

    public void logout() {
        System.out.println("You Have Been Logged Out!");
    }

    public boolean checkPayment(User user) {
        return false;
    }

    public boolean disableAccount(User user) {
        return false;
    }

    public boolean enableAccount(User user) {
        return false;
    }
}
