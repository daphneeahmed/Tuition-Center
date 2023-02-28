import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create new object for TuitionCenterList
        TuitionCenterList district1 = new TuitionCenterList();

        // Information needed for the tuition center
        Name headmasterName = new Name("Severus", "Tobias", "Snape");
        Address tuitionAddress = new Address("6B", "Lorong Delima 1","11600", "Georgetown", "Pulau Pinang", "Malaysia");
        TuitionCenter premier = new TuitionCenter("Premier Tuition Center", headmasterName, tuitionAddress, 5);
        district1.addCenter(premier);

        // Create object for student list (what batch they are in) and tutor list
        StudentList batch1 = new StudentList();
        TutorList tutors = new TutorList();

        // Information on tutor
        Name tutorName = new Name("James", "Gabriel", "Keogh");
        Address tutorAddress = new Address("31", "Moonga Rd", "3142", "Toorak VIC", "Victoria", "Australia");
        Tutor james = new Tutor(tutorName, "000000-00-0000", tutorAddress, "Masters", 6, "21 May 2021", 3);
        tutors.addTutor(james);

        // Information on students
        Name studName = new Name("Andrew", "John", "Hozier-Byrne");
        Address studAddress = new Address("6", "Park Road", "A96", "Dun Laoghaire", "Co. Dublin", "Ireland");
        Student andrew = new Student(studName, "000000-00-0000", studAddress, "Year 10", "St. Gerald's Catholic School");

        // Setting the scores for student andrew
        andrew.setScore(50, 0);
        andrew.setScore(85, 1);
        andrew.setScore(45, 2);
        andrew.setScore(90, 3);

        // Calculation for student andrew's scores
        andrew.calcAvg();
        andrew.calcMax();
        andrew.calcMin();

        // Adding student andrew to object batch1
        batch1.addStudent(andrew);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String option = "";
        Scanner input = new Scanner(System.in);
        while (!option.equals("C")) {
            System.out.println("-- Choose option --");
            System.out.println("A. Close a tuition center \nB. Display report for tuition center \nC. Quit program");
            System.out.print("Option: ");
            option = input.nextLine();
            if (option.equals("A")){
                System.out.println("Which tuition center would you like to close?");
                district1.displayAll();
                if(district1.getTuitionCenters().size() != 0) {
                    System.out.print("Name: ");
                    String tName = input.nextLine();
                    if (district1.checkElement(tName)) {
                        district1.removeCenter(tName);
                    } else {
                        System.out.println("Tuition center not found.");
                    }
                }
                else{
                    System.out.println("There are no tuition centers.");
                }
            }
            else if(option.equals("B")){
                System.out.println("\n-- Pandai Sdn Bhd Report --\n");
                district1.display(0);
                System.out.println("# of students: " + batch1.getCurrSz());
                System.out.println("# of tutors: " + tutors.getCurrSz());
                System.out.println("Student performance");
                batch1.displayAll();
                System.out.println("\n");


            }
        }
    }
}