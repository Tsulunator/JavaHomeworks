package N3;

public class Dolly extends Toy {
    private double hairCost;
    private double clothesCost;
    private double other;

    public Dolly(String name, double hairCost, double clothesCost, double other) {
        super(name);
        this.hairCost = hairCost;
        this.clothesCost = clothesCost;
        this.other = other;
    }

    public double calculatePrice() {
        return hairCost + clothesCost + other;
    }
}