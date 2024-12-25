package N2;

public class Shape{
    protected double x;
    protected double y;

    public Shape(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double calculatePerimeter(){
        return 0;
    }

    public void printShapeName(){
        System.out.println("N2.Shape");
    }

    public void printData(){
        System.out.println("x: " + x + ", y: " + y);
    }
}