package intern;

public class Registration extends Base {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phone;

    public Registration (String newId, String regFirstName, String regLastName, String regEmail, String regPassword, String regPhone){
        super(RecordType.REGISTRATIONINFO);
        this.id = newId;
        this.firstName = regFirstName;
        this.lastName = regLastName;
        this.email = regEmail;
        this.password = regPassword;
        this.phone = regPhone;
    }
/***Getters for Registration object fields*/
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

/***Setters for Registration object fields*/

    public void setFirstName(String regFirstName) {
        this.firstName = regFirstName;
    }

    public void setLastName(String regLastName) {
        this.lastName = regLastName;
    }

    public void setEmail(String regEmail) {
        this.email = regEmail;
    }

    public void setPassword(String regPassword) {
        this.password = regPassword;
    }

    public void setPhone(String regPhone) {
        this.phone = regPhone;
    }
}
