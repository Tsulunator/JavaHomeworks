package N1;

public class Triangle extends NAngles{
    public Triangle(double Length){
        super(3, Length);
    }

    public double calculatePerimeter(){
        return 3 * Length;
    }
}