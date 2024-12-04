public class Car{
    String make;
    String model;
    int year;
    String registrationNumber;

    public Car(String make, String model, int year, String registrationNumber){
        this.make = make;
        this.model = model;
        this.year = year;
        this.registrationNumber = registrationNumber;
    }

    public void printInfo(){
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Year of Manufacture: " + year);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println();
    }
}