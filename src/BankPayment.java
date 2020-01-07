public class BankPayment implements Payment {
    /* Attributes */
    public String paymentStatus;

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

    @Override
    public void updateDB(User user, int amount) {
        if(makePayment(user, amount) == false) {
            paymentStatus = "Not Paid!";
            Database.getInstance().updatePaymentStatus(paymentStatus);
        }
        else if(makePayment(user, amount) == true) {
            paymentStatus = "Paid!";
            Database.getInstance().updatePaymentStatus(paymentStatus);
        }
    }
}
