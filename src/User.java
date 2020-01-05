public abstract class User {
    /* Attributes */
    public String userName;
    public String email;
    public String phoneNo;
    public String password;
    public String gender;
    public int age;
    public int starRating;
    public String membershipType;
    public String cardNumber;
    public String expDate;

    /* Constructor */
    public User(String userName, String email, String phoneNo, String password, String gender, int age, int starRating, String membershipType, String cardNumber, String expDate) {
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.starRating = starRating;
        this.membershipType = membershipType;
        this.cardNumber = cardNumber;
        this.expDate = expDate;
        Database.getInstance().saveUserDetails(this);
    }

    /* Getter and Setter Methods */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public String getMembershipType() {
        return membershipType;
    }

    public void setMembershipType(String membershipType) {
        this.membershipType = membershipType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    /* Methods */
    public boolean login(String email, String password) {
        return false;
    }

    public void logout() {
        System.out.println("You Have Been Logged Out!, Please Login Again to Use Our Services!");
    }

    public boolean updatePassword(String password) {
        return false;
    }

    public boolean deleteAcc(String email, String password) {
        return false;
    }

    public void reportAbuse() {
        System.out.println("Report Filed!");
    }
}
