public class Reindeer extends WorkshopMember{
    private int flyingSpeed;
    private String noseColor;

    public Reindeer(String name, String nickName, int age, int flyingSpeed, String noseColor){
        super(name, nickName, age);
        this.flyingSpeed = flyingSpeed;
        this.noseColor = noseColor;
    }

    public void fly(){
        System.out.println(getName() + "speed:" + flyingSpeed);
    }

    public void trainForChristmas(){
        System.out.println(getName() + " is trainin");
    }

    public int getFlyingSpeed(){
        return flyingSpeed;
    }

    public void setFlyingSpeed(int flyingSpeed){
        this.flyingSpeed = flyingSpeed;
    }

    public String getNoseColor(){
        return noseColor;
    }

    public void setNoseColor(String noseColor){
        this.noseColor = noseColor;
    }
}