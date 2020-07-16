package intern;

public class Billing extends Base {
    private String holderName;
    private String cardNumber;
    private String expirationMonth;
    private String expirationYear;
    private String securityCode;
    private String address;
    private String city;
    private String postalCode;
    private String cardState;
    private String cardCountry;

    public Billing(String newID){
        super(newID);
        this.type = RecordType.BILLINGINFO;
    }

    public Billing(String newID, String holderName, String cardNumber, String expirationMonth, String expirationYear, String securityCode, String address, String city,
                   String postalCode, String cardState, String cardCountry){
        super(RecordType.BILLINGINFO);
        this.id = newID;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.securityCode = securityCode;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
        this.cardState = cardState;
        this.cardCountry = cardCountry;
    }
    /***Getters for Billing object fields*/

    public String getHolderName() {
        return holderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCardState() {
        return cardState;
    }

    public String getCardCountry() {
        return cardCountry;
    }

    /***Setters for Registration object fields*/

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setCardState(String cardState) {
        this.cardState = cardState;
    }

    public void setCardCountry(String cardCountry) {
        this.cardCountry = cardCountry;
    }
}
