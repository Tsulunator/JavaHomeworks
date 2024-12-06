public class Bank {
    private double money;
    private String history = "";
    private boolean locked = true;
    private String password;

    public Bank(double money, String password){
        this.money = money;
        this.password = password;
    }

    public void lock(){
        locked=true;
    }

    public void unlock(String attempt){
        if(password!=attempt){
            System.out.println("Incorrect password");
        }else{
            locked=false;
        }
    }

    public void depositCalc(double cash, int year){
        if(locked){
            System.out.println("blocked");
            return;
        }
        for(int i=0; i<year; i++){
            cash*=1.1;
        }
        System.out.println("You " + year + " years later " + cash + " money :):):)(if inflation is not accounted for)");
    }

    public void transfer(double transferMoney, int account){
        if(locked){
            System.out.println("blocked");
            return;
        }
        if(transferMoney > 1000||transferMoney<0){
            System.out.println("input money must be in between 0.01 and 1000");
            return;
        }else if(transferMoney >this.money){
            System.out.println("Not enough money");
            return;
        }
        this.money-= transferMoney;
        history += "\n" + Double.toString(transferMoney) + " transferred to " + account + " ";
    }

    public void history(){
        if(locked){
            System.out.println("blocked");
            return;
        }
        System.out.println(history);
    }
}