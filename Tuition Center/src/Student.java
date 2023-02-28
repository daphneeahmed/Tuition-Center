public class Student {
    // Data
    private Name studName;
    private String ic;
    private Address studAddress;
    private String year;
    private String schoolName;
    private float[] scores = new float[4];

    // Default constructor
    public Student(){
    }

    // Constructor with setter
    public Student(Name studName, String ic, Address studAddress, String year, String schoolName){
        this.studName = studName;
        this.ic = ic;
        this.studAddress = studAddress;
        this.year = year;
        this.schoolName = schoolName;
    }

    public void setScore(float score, int i){
        scores[i] = score;
    }

    //Getter
    public Name getStudName(){
        return studName;
    }

    public String getIc(){
        return ic;
    }

    public String getYear(){
        return year;
    }

    public String getSchoolName(){
        return schoolName;
    }

    // Operations

    // Calculate average scores
    public float calcAvg(){
        float sum = 0;
        float avg;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        avg = sum / scores.length;
        return avg;
    }

    // Calculate the maximum score
    public float calcMax(){
        float max = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] > max){
                max = scores[i];
            }
        }
        return max;
    }

    // Calculate the minimum score
    public float calcMin(){
        float min = 101;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] < min){
                min = scores[i];
            }
        }
        return min;
    }
}
