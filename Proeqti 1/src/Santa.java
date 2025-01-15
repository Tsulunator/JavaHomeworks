import java.util.List;
import java.util.ArrayList;

public class Santa extends WorkshopMember implements ChristmasSpirit{
    private List<Child> childrenList = new ArrayList<>();

    public Santa(String name, String nickName, int age){
        super(name, nickName, age);
    }

    public void spreadJoy(){
        System.out.println(getName() + "spreading joy!");
    }

    public void singCarols(){
        System.out.println(getName() + "singing");
    }

    public void decorateTree(){
        System.out.println(getName() + " decorating tree!");
    }

    public void deliverGifts() {
        System.out.println(getName() + " delivering gifts!");
    }

    public List<Child> checkNaughtyOrNiceList(){
        List<Child> goodChildren = new ArrayList<>();
        for(Child child : childrenList){
            if (child.getBehaviorScore() > 5){
                goodChildren.add(child);
            }
        }
        return goodChildren;
    }

    public List<Child> getChildrenList(){
        return childrenList;
    }

    public void setChildrenList(List<Child> childrenList){
        this.childrenList = childrenList;
    }
}