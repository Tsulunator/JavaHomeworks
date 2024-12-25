package N3;

public abstract class Toy{
    protected String name;
    public Toy(String name){
        this.name = name;
    }
    public abstract double calculatePrice();

    public void printPrice(){
        System.out.println(name + " price: " + calculatePrice());
    }
}