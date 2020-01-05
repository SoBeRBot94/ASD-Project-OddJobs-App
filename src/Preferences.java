public class Preferences {
    /* Attributes */
    public int age;
    public String gender;
    public int numPeople;
    public float startTime;
    public float totalNumHours;
    public String email;

    /* Constructor */
    public Preferences(int age, String gender, int numPeople, float startTime, float totalNumHours, String email) {
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.numPeople = numPeople;
        this.startTime = startTime;
        this.totalNumHours = totalNumHours;
    }

    /* Getter and Setter Methods */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }

    public float getStartTime() {
        return startTime;
    }

    public void setStartTime(float startTime) {
        this.startTime = startTime;
    }

    public float getTotalNumHours() {
        return totalNumHours;
    }

    public void setTotalNumHours(float totalNumHours) {
        this.totalNumHours = totalNumHours;
    }

    /* Methods */
    public void updateDB() {
        Database.getInstance().savePreferences(this);
    }
}
