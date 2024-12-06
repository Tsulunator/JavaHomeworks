
public class Main {
    public static void main(String[] args){
        Bank bank = new Bank(2, "123456");

        bank.unlock("123456");

        bank.depositCalc(100000, 3);
        bank.transfer(1, 243423479);
        bank.transfer(1, 243423479);
        bank.transfer(1, 243423479);
        bank.transfer(1, 243423479);
        bank.transfer(1, 243423479);
        bank.transfer(1, 243423479);
        bank.transfer(1, 243423479);

        bank.history();

        bank.lock();
    }
}