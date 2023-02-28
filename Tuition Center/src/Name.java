public class Name {
    // Data
    private String fName;
    private String mName;
    private String lName;

    // Constructor with setter
    public Name(String fName, String mName, String lName){
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    // Getter
    public String getFName(){
        return fName;
    }

    public String getMName(){
        return mName;
    }

    public String getLName(){
        return lName;
    }
}
