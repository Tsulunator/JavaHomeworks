package N3;

public class Car extends Toy{
    private double salonCost;
    private double wheelCost;
    private int wheelQuantity;
    private double other;

    public Car(String name, double salonCost, double wheelCost, int wheelQuantity, double other){
        super(name);
        this.salonCost = salonCost;
        this.wheelCost = wheelCost;
        this.wheelQuantity = wheelQuantity;
        this.other = other;
    }

    public double calculatePrice() {
        return salonCost + (wheelCost * wheelQuantity) + other;
    }
}