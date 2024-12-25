package N1;

public class NAngles{
    protected int numberOfSides;
    protected double Length;

    public NAngles(int numberOfSides, double Length){
        this.numberOfSides = numberOfSides;
        this.Length = Length;
    }

    public double calculatePerimeter(){
        return numberOfSides * Length;
    }
}