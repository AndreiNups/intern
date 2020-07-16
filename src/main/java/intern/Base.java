package intern;

public class Base {
    protected String id;
    protected RecordType type;

    public Base(){
    }

    public Base (String newId, RecordType newType){
        this.id = newId;
        this.type = newType;
    }

    public Base(RecordType newType) {
        this.type = newType;
    }

    public Base(String newID) {
        this.id = newID;
    }

    /***Getters for the Base object fields*/
    public String getId() {
        return id;
    }

    public RecordType getType() {
        return type;
    }
/***Setters for the Base object fields*/
    public void setId(String newId) {
        this.id = newId;
    }

    public void setType(RecordType newType) {
        this.type = newType;
    }
}
