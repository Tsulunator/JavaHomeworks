package N1;

public class Square extends NAngles{
    public Square(double Length){
        super(4, Length);
    }

    public double calculatePerimeter(){
        return 4 * Length;
    }
}