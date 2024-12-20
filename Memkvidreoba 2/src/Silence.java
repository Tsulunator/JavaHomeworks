public class Silence extends Employee {
    private double control;

    public Silence(String firstName, String lastName, int id, double strictness){
        super(firstName, lastName, id);
        this.control = strictness;
    }

    public String toString(){
        return super.toString() + ", Strictness Level: " + control;
    }
}