import java.util.Scanner;

public class Main{
    //2
    public static int Magic1(int a, int b, int k){
        if(a > b){
            return 0;
        }
        if(a % k == 0){
            return a + Magic1(a + 1, b, k);
        }
        return Magic1(a + 1, b, k);
    }
    //3
    public static int Magic2(int n){
        if(n==1){
            return 1;
        }
        return n + Magic2(n - 1);
    }
    //4
    public static int Magic3(int a, int n){
        if(n == 0){
            return 1;
        }
        return a * Magic3(a, n - 1);
    }
    //5
    public static int counter(int number){
        if(number == 0){
            return 0;
        }
        if(number % 10 == 0){
            return 1 + counter(number / 10);
        }else{
            return counter(number / 10);
        }
    }
    public static void checker(int number) {
        int zeroCount = counter(Math.abs(number));
        if(zeroCount == 0){
            System.out.println("no zero");
        }else if(zeroCount % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println(zeroCount);
    }
    public static void main(String[] args){
        //1
        /*
        Car car1 = new Car("Toyota", "Corolla", 2015, "ABC123");
        Car car2 = new Car("Honda", "Civic", 1345789, "E");
        System.out.println("Car 1:");
        car1.printInfo();
        System.out.println("Car 2:");
        car2.printInfo();
        System.out.println("Updating");
        car1.registrationNumber = "EHATER";
        System.out.println("Updated Car 1:");
        car1.printInfo();
         */

        //2
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("a");
        int a = scanner.nextInt();
        System.out.print("b");
        int b = scanner.nextInt();
        System.out.print("k");
        int k = scanner.nextInt();
        int result = Magic1(a, b, k);
        System.out.println(result);
         */

        //3
        /*
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = Magic2(n);
        System.out.println(result);
         */

        //4
        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int result = Magic3(a, n);
        System.out.println(result);
         */

        //5
        //checker(1000);
    }
}