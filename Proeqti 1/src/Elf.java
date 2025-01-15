public class Elf extends WorkshopMember implements ChristmasCelebrator{
    private int skillLevel;
    private String elfType;

    public Elf(String name, String nickName, int age, int skillLevel, String elfType){
        super(name, nickName, age);
        this.skillLevel = skillLevel;
        this.elfType = elfType;
    }

    public void makeToy() {
        increaseExperience();
        System.out.println(getName() + "making toy!");
    }

    public void wrapGifts() {
        increaseExperience();
        System.out.println(getName() + "wrapping gifts");
    }

    private void increaseExperience() {
        System.out.println(getName() + "experience!");
    }

    public void celebrateChristmas() {
        System.out.println(getName() + "celebrating Christmas!");
    }

    public void hostChristmasParty(){
        System.out.println(getName() + " hosting a Christmas party!");
    }


    public int getSkillLevel(){
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel){
        this.skillLevel = skillLevel;
    }

    public String getElfType(){
        return elfType;
    }

    public void setElfType(String elfType){
        this.elfType = elfType;
    }
}
