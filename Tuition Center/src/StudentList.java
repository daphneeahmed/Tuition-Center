public class StudentList {
    // Data
    private Student[] batch = new Student[10];

    private int currSz = 0;

    // Getter
    public Student[] getBatch(){
        return batch;
    }

    public int getCurrSz(){
        return currSz;
    }

    // Operations

    // Add a new student to the list
    public void addStudent(Student s){
        batch[currSz] = s;
        currSz++;
    }

    // Display all information about the students in the list
    public void displayAll(){
        for (int i = 0; i < batch.length; i++){
            if(this.batch[i] != null) {
                System.out.println("Name: " + batch[i].getStudName().getFName() + " " + batch[i].getStudName().getMName() + " " + batch[i].getStudName().getLName());
                System.out.println("IC: " + batch[i].getIc());
                System.out.println("Year: " + batch[i].getYear());
                System.out.println("School name: " + batch[i].getSchoolName());
                System.out.println("Average marks: " + batch[i].calcAvg());
                System.out.println("Min marks: " + batch[i].calcMin());
                System.out.println("Max marks: " + batch[i].calcMax());
            }
            else{
                break;
            }
        }


    }
}
