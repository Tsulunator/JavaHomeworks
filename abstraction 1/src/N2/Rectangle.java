package N2;

public class Rectangle extends Shape{

    public Rectangle(double x, double y){
        super(x, y);
    }

    public double calculatePerimeter(){
        return 2 * (x + y);
    }

    public void printShapeName(){
        System.out.println("N2.Rectangle");
    }

    public void printData() {
        super.printData();
    }
}
