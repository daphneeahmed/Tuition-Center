import java.util.ArrayList;

public class TuitionCenterList {

    // Data
    private TuitionCenter tuitionCenterData = new TuitionCenter();
    private ArrayList<TuitionCenter> tuitionCenters = new ArrayList<>();

    // Getter
    public TuitionCenter getTuitionCenterData(){
        return tuitionCenterData;
    }

    public ArrayList<TuitionCenter> getTuitionCenters(){
        return tuitionCenters;
    }

    // Operations
    public void addCenter(TuitionCenter tc){
        tuitionCenters.add(tc);
    }

    // Display information about a tuition center
    public void display(int i){
        System.out.println("Tuition center: " + tuitionCenters.get(i).getCenterName());
        System.out.println("Headmaster: " + tuitionCenters.get(i).getHeadmasterName().getFName() + " " + tuitionCenters.get(i).getHeadmasterName().getMName() + " " + tuitionCenters.get(i).getHeadmasterName().getLName());


    }

    // Display information about all tuition centers
    public void displayAll(){
        for (int i = 0; i < tuitionCenters.size(); i++) {
            String name = tuitionCenters.get(i).getCenterName();
            System.out.println("Tuition center list:");
            System.out.println("- " + name);
        }

    }

    // Get the index of chosen tuition center
    public int getIndex(ArrayList<TuitionCenter> tuitionCenters, String tName){
        int index = 0;
        for (int i = 0; i < tuitionCenters.size(); i++){
            if(tuitionCenters.get(i).getCenterName().equals(tName)){
                index = i;
            }
        }
        return index;
    }

    // Check if the input tuition center is inside the tuitionCenters
    public boolean checkElement(String tName){
        boolean isIn = false;
        for (int i = 0; i < tuitionCenters.size(); i++) {
            if (tuitionCenters.get(i).getCenterName().contains(tName)) {
                isIn = true;
            }
        }
        return isIn;
    }

    //Remove the chosen tuition center
    public void removeCenter(String tName){
        int index = getIndex(tuitionCenters, tName);
        tuitionCenters.remove(index);
        System.out.println("Tuition center removed from list successfully");
    }
}
