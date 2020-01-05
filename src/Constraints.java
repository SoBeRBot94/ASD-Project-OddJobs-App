public class Constraints {
    /* Attributes */
    public String location;
    public String email;

    /* Constructor */
    public Constraints(String location, String email) {
        this.location = location;
        this.email = email;
    }

    /* Getter and Setter Methods */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    /* Methods */
    public void updateDB() {
        Database.getInstance().saveConstraints(this);
    }
}
