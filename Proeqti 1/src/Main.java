public class Main{
    public static void main(String[] args) {
        Elf elf = new Elf("Vegeta", "smallboy", 49, 5, "ToyMaker");
        elf.makeToy();
        elf.wrapGifts();

        Reindeer reindeer = new Reindeer("Flash", "Reverseflash", 3, 15, "Yellow");
        reindeer.fly();

        Child child = new Child("Mrbeast", 1);
        child.addWish("Money");
        child.addWish("100 people in circle");

        Santa santa = new Santa("Santa", "Santa covered with blood", 1000000);
        santa.getChildrenList().add(child);
        System.out.println(santa.checkNaughtyOrNiceList());
        santa.deliverGifts();

        Snowman snowman = new Snowman(19, "Red", true);
        snowman.decorate("Scarf");
        snowman.melt();
        snowman.makeMagical();
    }
}