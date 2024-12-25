package N4;

public abstract class Employee {
    protected String firstName;
    protected String lastName;
    protected String phoneNumber;

    public Employee(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public abstract int getSalary();

    public void printDetails() {
        System.out.println(getSalary());
    }
}