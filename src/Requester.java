/* Imports */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* Class Declaration */
// Requester class also implements Payments Interface (implicitly)
public class Requester extends User implements UserAPI {
    /* Attributes */
    public Preferences preferences;
    public Constraints constraints;
    public List<Request> requestList;

    /* Constructor */
    public Requester(String userName, String email, String phoneNo, String password, String gender, int age, int starRating, String membershipType, String cardNumber, String expDate) {
        super(userName, email, phoneNo, password, gender, age, starRating, membershipType, cardNumber, expDate);
        this.requestList = new ArrayList<Request>();
    }

    public Requester(String userName, String email, String phoneNo, String password, String gender, int age, int starRating, String membershipType, String cardNumber, String expDate, Preferences preferences, Constraints constraints, List<Request> requestList) {
        super(userName, email, phoneNo, password, gender, age, starRating, membershipType, cardNumber, expDate);
        this.preferences = preferences;
        this.constraints = constraints;
        this.requestList = requestList;
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
    public boolean makePayment(User user, int amount, String type) {
        //Polymorphic Payments
        Payment payment = null;
        if (type.equals("Swish")) {
            payment = new Swish();
        } else if (type.equals("BankPayment")) {
            payment = new BankPayment();
        }
        return payment.makePayment(user, amount);
    }

    public boolean createRequest(String jobTitle, String jobDescription, long bid, long wage, Date date) {
        Request request = new Request(jobTitle, jobDescription, bid, wage, date, "NEW");
        requestList.add(request);
        Logger.getInstance().logRequest(request);
        return true;
    }
}
