import java.util.ArrayList;
import java.util.HashMap;

public class Student implements Comparable<Student>{
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> frame;

    public Student(String id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.frame = new HashMap<>();
    }

    public void addPoints(String subject, int point){
        if(!frame.containsKey(subject)){
            frame.put(subject, new ArrayList<>());
        }
        frame.get(subject).add(point);
    }

    public double getAveragePoint(){
        int totalPoints = 0;
        int totalSubjects = 0;

        for (ArrayList<Integer> points : frame.values()){
            for (int point : points) {
                totalPoints += point;
                totalSubjects++;
            }
        }
        return (double) totalPoints / totalSubjects;
    }

    public int compareTo(Student o){
        double averageThis = this.getAveragePoint();
        double averageOther = o.getAveragePoint();

        if(averageThis > averageOther){
            return 1;
        } else if (averageThis < averageOther){
            return -1;
        } else {
            return 0;
        }
    }

    public void printPoints(){
        for (String subject : frame.keySet()){
            System.out.println(subject +"="+ frame.get(subject));
        }
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}