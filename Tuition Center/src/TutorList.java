public class TutorList {
    // Data
    private Tutor[] tutors = new Tutor[5];
    private int currSz = 0;

    // Getter
    public int getCurrSz(){
        return currSz;
    }

    public Tutor[] getTutors(){
        return tutors;
    }

    // Operation

    // Add a new tutor to the list
    public void addTutor(Tutor t){
        tutors[currSz] = t;
        currSz++;
    }

}
