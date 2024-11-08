import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //1
        /*
        int n = 5;
        int done = 0;
        for (int i = 1; i <= n; i++){
            done+=i;
        }
        System.out.println(done);
         */

        //2
        /*
        int n = 15;
        int numba = n;
        int addnumba = 0;
        boolean yes = false;
        for (int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if (Math.pow(2, j) == i){
                    yes = true;
                    break;
                }
            }
            if(yes==true){
                System.out.println(i + "e");
                addnumba += i;
                yes = false;
                numba -= i;
                i = numba + 1;
            }
        }
        if(addnumba==n-1){
            System.out.println(1 + "e");
        }
        */

        //3
        /*
        for (int i = 1; i <= 15; i++){
            if(i % 2!= 0 && i!=5 && i!=7 && i!=11){
                System.out.println(i);
            }
        }
         */

        //4
        /*
        Scanner scanner = new Scanner(System.in);
        String Input = scanner.nextLine();
        int numba = 0;
        if(Input.charAt(0)==1 && Input.length()==1){
            System.out.println("1");
            return;
        }else if(Input.charAt(0)==0 && Input.length()==1){
            System.out.println("0");
            return;
        }

        for(int i = Input.length()-1; i>=0; i--){
            int CorrectPosition=Input.length()-1-i;
            if(Input.charAt(i)=='1'){
                numba+=(Math.pow(2, CorrectPosition));
            }else if(Input.charAt(i)=='0'){
                numba+=0;
            }
        }
        System.out.println(numba);
         */

        //5
        /*
        Scanner scanner = new Scanner(System.in);
        int Input = scanner.nextInt();
        String Output = "";
        for (int i = Input; i > 0; i /= 2){
            Output = (i % 2) + Output;
        }
        if (Input == 0){
            Output = "0";
        }
        System.out.println(Output);
        */

        //6
        /*
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int target = random.nextInt(100) + 1;
        int guess = 0;
        int attempts =  0;
        while (guess != target){
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < target){
                System.out.println("bigger");
            }else if (guess > target){
                System.out.println("smaller");
            }else{
                System.out.println("You won :)");
                System.out.println("Attemps: " + attempts);
                if(attempts>5){
                    System.out.println("Skill Issues");
                }else if(attempts==1) {
                    System.out.println("Lucky");
                }
            }
        }
        */
    }
}