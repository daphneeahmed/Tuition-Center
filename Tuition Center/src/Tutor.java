public class Tutor {
    // Data
    private Name tutorName;
    private String ic;
    private Address tutorAddress;
    private String qualification;
    private int numOfYearExp;
    private String dateJoined;
    private int yearsInCenter;

    // Default constructor
    public Tutor(){

    }

    // Constructor with setter
    public Tutor(Name tutorName, String ic, Address tutorAddress, String qualification, int numOfYearExp, String dateJoined, int yearsInCenter){
        this.tutorName = tutorName;
        this.ic = ic;
        this.tutorAddress = tutorAddress;
        this.qualification = qualification;
        this.numOfYearExp = numOfYearExp;
        this.dateJoined = dateJoined;
        this.yearsInCenter = yearsInCenter;
    }

    // Getter
    public Name getName(){
        return tutorName;
    }

    public String getIc(){
        return ic;
    }

    public Address getAddress(){
        return tutorAddress;
    }

    public String getQualification() {
        return qualification;
    }

    public int getNumOfYearExp(){
        return numOfYearExp;
    }
    public String getDateJoined(){
        return dateJoined;
    }

    public int getYearsInCenter(){
        return yearsInCenter;
    }


}
