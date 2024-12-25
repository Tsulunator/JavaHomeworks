package N4;

public class FixedSalaryEmployee extends Employee{
    private int salary;

    public FixedSalaryEmployee(String firstName, String lastName, String phoneNumber, int salary){
        super(firstName, lastName, phoneNumber);
        this.salary = salary;
    }

    public int getSalary(){
        return salary;
    }
}
