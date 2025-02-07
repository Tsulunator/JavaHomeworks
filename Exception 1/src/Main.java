import java.util.Scanner;

public class Main {
    public static void checkNumber(int number){
        if (number < 0){
            String intstr = String.valueOf(number);
            throw new NegativeNumberException(intstr);
        }
    }

    public static double getSmall(double number) throws IllegalArgumentException{
        if (number < 0){
            throw new IllegalArgumentException("Illegal");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        //1
        /*
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        while(true){
            a = input.nextInt();
            b = input.nextInt();
            try{
                System.out.println(a/b);
            }catch(ArithmeticException c){
                System.out.println(":(");
            }
        }
         */


        //2
        /*
        Scanner input = new Scanner(System.in);
        String str = input.next();
        try {
            int strint = Integer.parseInt(str);
            System.out.println(strint / 100);
        }catch (NumberFormatException c){
            System.out.println(":(");
        }catch (ArithmeticException c){
            System.out.println(">:(");
        }
         */


        //3
        /*
        Scanner input = new Scanner(System.in);
        while (true){
            try {
                int num = input.nextInt();
                checkNumber(num);
            }catch (NegativeNumberException a){
                System.out.println(a);
            }
        }
         */

        //4
        /*
        Scanner input = new Scanner(System.in);
        while (true){
            double num = input.nextDouble();
            try {
                System.out.println(getSmall(num));
            }catch (IllegalArgumentException a){
                System.out.println(a);
            }
        }
         */
    }
}