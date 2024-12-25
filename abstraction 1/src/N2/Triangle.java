package N2;

public class Triangle extends Shape{
    private double z;

    public Triangle(double x, double y, double z){
        super(x, y);
        this.z = z;
    }

    public double calculatePerimeter(){
        return x + y + z;
    }

    public void printShapeName(){
        System.out.println("N2.Triangle");
    }

    public void printData(){
        super.printData();
        System.out.println("z: " + z);
    }
}
