public class Car{
    String manufacturer;
    String company;
    String model;
    String stateNumber;

    public class Engine{
        String fuelType;
        int numberOfCylinders;
        int resource;

        Engine(String fuelType, int numberOfCylinders, int resource){
            this.fuelType = fuelType;
            this.numberOfCylinders = numberOfCylinders;
            this.resource = resource;
        }
    }

    Engine engine;

    public Car(String manufacturer, String company, String model, String stateNumber, String fuelType, int numberOfCylinders, int resource){
        this.manufacturer = manufacturer;
        this.company = company;
        this.model = model;
        this.stateNumber = stateNumber;
        this.engine = new Engine(fuelType, numberOfCylinders, resource);
    }

    public void printCarInfo(){
        System.out.println("Car Info:");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("State Number: " + stateNumber);
        System.out.println("Engine Info:");
        System.out.println("Fuel Type: " + engine.fuelType);
        System.out.println("Cylinders: " + engine.numberOfCylinders);
        System.out.println("Engine Resource: " + engine.resource);
    }
}