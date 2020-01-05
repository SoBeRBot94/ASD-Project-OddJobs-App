public interface UserAPI {
    /* Abstract Methods */
    public boolean signUP(String email, String password);

    public boolean setConst(String location);

    public boolean setPref(int age, String gender, int numPeople, float startTime, float totalNumHours, String email);

    public boolean editConst(String location);

    public boolean editPref(int age, String gender, int numPeople, float startTime, float totalNumHours, String email);

    public boolean giveFeedback(int rating, String comment, String email);

    public boolean chooseMemType(String membershipType);
}