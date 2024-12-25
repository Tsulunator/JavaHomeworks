package N4;

public class DailyPaidEmployee extends Employee{
    private int daysWorked;
    private int dailyRate;

    public DailyPaidEmployee(String firstName, String lastName, String phoneNumber, int daysWorked, int dailyRate){
        super(firstName, lastName, phoneNumber);
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    public int getSalary(){
        return daysWorked * dailyRate;
    }
}
