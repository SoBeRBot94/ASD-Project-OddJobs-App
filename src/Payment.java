public interface Payment {
    /* Abstract Methods */
    public boolean makePayment(User user, int amount);

    public boolean checkBalance(User user);
}