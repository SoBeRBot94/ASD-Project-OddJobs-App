public class Feedback {
    /* Attributes */
    public int rating;
    public String comment;
    public String email;

    /* Constructor */
    public Feedback(int rating, String comment, String email) {
        this.rating = rating;
        this.comment = comment;
        this.email = email;
    }
    /* Getter and Setter Methods */

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /* Methods */
    public void updateDB() {
        Database.getInstance().saveFeedback(this);
    }
}