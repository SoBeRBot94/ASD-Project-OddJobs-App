/* Imports */

import java.util.ArrayList;
import java.util.List;

/* Class Declaration */
public class Responder extends User implements UserAPI {
    /* Attributes */
    public Preferences preferences;
    public Constraints constraints;
    public List<Match> matches;
    public String skills;

    /* Constructor */
    public Responder(String userName, String email, String phoneNo, String password, String gender, int age, int starRating, String membershipType, String cardNumber, String expDate) {
        super(userName, email, phoneNo, password, gender, age, starRating, membershipType, cardNumber, expDate);
        this.matches = new ArrayList<Match>();
    }

    public Responder(String userName, String email, String phoneNo, String password, String gender, int age, int starRating, String membershipType, String cardNumber, String expDate, Preferences preferences, Constraints constraints, List<Match> matches, String skills) {
        super(userName, email, phoneNo, password, gender, age, starRating, membershipType, cardNumber, expDate);
        this.preferences = preferences;
        this.constraints = constraints;
        this.matches = matches;
        this.skills = skills;
    }

    /* UserAPI Methods */
    @Override
    public boolean signUP(String email, String password) {
        return false;
    }

    @Override
    public boolean setConst(String location) {
        constraints = new Constraints(location, email);
        return false;
    }

    @Override
    public boolean setPref(int age, String gender, int numPeople, float startTime, float totalNumHours, String email) {
        preferences = new Preferences(age, gender, numPeople, startTime, totalNumHours, email);
        return false;
    }

    @Override
    public boolean editConst(String location) {
        this.constraints.setLocation(location);
        return false;
    }

    @Override
    public boolean editPref(int age, String gender, int numPeople, float startTime, float totalNumHours, String email) {
        this.preferences.setAge(age);
        this.preferences.setGender(gender);
        this.preferences.setNumPeople(numPeople);
        this.preferences.setStartTime(startTime);
        this.preferences.setTotalNumHours(totalNumHours);
        return false;
    }

    @Override
    public boolean giveFeedback(int rating, String comment, String email) {
        Feedback feedback = new Feedback(rating, comment, email);
        return false;
    }

    @Override
    public boolean chooseMemType(String membershipType) {
        return false;
    }

    /* Methods */
    public boolean acceptJob(Match match) {
        matches.add(match);
        return false;
    }

    public boolean cancelJob(Match match) {
        return false;
    }

    public void updateJobStatus(Match match) {

    }

    public boolean checkBalance(User user, String type) {
        Payment payment = null;
        if (type.equals("Swish")) {
            payment = new Swish();
        } else if (type.equals("BankPayment")) {
            payment = new BankPayment();
        }
        return payment.checkBalance(user);
    }
}
