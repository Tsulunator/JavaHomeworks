package n1;

public class University{
    private String name;
    private boolean isStateUniversity;
    private int numberOfFaculties;

    public University(String name, boolean isStateUniversity, int numberOfFaculties){
        this.name = name;
        this.isStateUniversity = isStateUniversity;
        this.numberOfFaculties = numberOfFaculties;
    }

    public void printUniversityInfo(){
        System.out.println("Name:" + name);
        System.out.println("Status:" + (isStateUniversity ? "State n1.University" : "Private n1.University"));
        System.out.println(numberOfFaculties);
    }
}
