public class TuitionCenter {
    private String centerName;
    private Address tuitionAddress;
    private Name headMaster;
    private int numOfTutor;

    public TuitionCenter(){
    }

    // Constructor for class, and setter
    public TuitionCenter(String centerName, Name headMaster, Address tuitionAddress, int numOfTutor){
        this.centerName = centerName;
        this.headMaster = headMaster;
        this.tuitionAddress = tuitionAddress;
        this.numOfTutor = numOfTutor;
    }

    // Getter for class attributes
    public String getCenterName(){
        return centerName;
    }
    public Name getHeadmasterName() {
        return headMaster;
    }

    public Address getTuitionAddress(){
        return tuitionAddress;
    }

    public int getNumOfTutor(){
        return numOfTutor;
    }

}
