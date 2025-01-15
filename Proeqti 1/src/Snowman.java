import java.util.List;
import java.util.ArrayList;

public class Snowman{
    private double height;
    private String hatColor;
    private boolean isMagical;
    private List<String> accessories = new ArrayList<>();

    public Snowman(double height, String hatColor, boolean isMagical){
        this.height = height;
        this.hatColor = hatColor;
        this.isMagical = isMagical;
    }

    public void decorate(String accessory){
        accessories.add(accessory);
        System.out.println("Decorated with " + accessory);
    }

    public void melt(){
        if (height > 0) {
            height /= 2;
            if (height < 1) height = 0;
            System.out.println("Snowman melted! height:" + height);
        }
    }

    public void makeMagical(){
        isMagical = true;
        System.out.println("Snowman is magical!");
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getHatColor(){
        return hatColor;
    }

    public void setHatColor(String hatColor){
        this.hatColor = hatColor;
    }

    public boolean isMagical(){
        return isMagical;
    }

    public void setMagical(boolean magical){
        isMagical = magical;
    }

    public List<String> getAccessories(){
        return accessories;
    }

    public void setAccessories(List<String> accessories) {
        this.accessories = accessories;
    }
}