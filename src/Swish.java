public class Swish implements Payment {
    /* Constructor */
    public Swish() {

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
