public class BankPayment implements Payment {
    /* Constructor */
    public BankPayment() {

    }

    /* Methods */
    @Override
    public boolean makePayment(User user, int amount) {
        return false;
    }

    @Override
    public boolean checkBalance(User user) {
        return false;
    }
}
