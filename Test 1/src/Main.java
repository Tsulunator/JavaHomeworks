
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        //1
        //b

        //2
        //b

        //3
        //d

        //4
        //c

        //5
        //a

        //6
        //c

        //7
        //a

        //8
        //a

        //9
        //a

        //10
        //c

        //11
        //b

        //12
        //c

        //13
        //b

        //14
        //a

        //15
        //a

        //16
        /*
        int[] arr= {3,2,3,10,5};
        int min = 0;
        int max = 0;
        int minStore = 0;
        int maxStore = 0;
        min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                maxStore=i;
            }

            if(arr[i]<min){
                min=arr[i];
                minStore=i;
            }
        }
        System.out.println(max);
        System.out.println(maxStore);
        System.out.println(min);
        System.out.println(minStore);
         */

        //17
        /*
        for(int i=1; i<=100; i++){
            if(i%5==0 && i%7==0) {
                System.out.println("HeyHow");
            }else if(i%5==0){
                System.out.println("Hey");
            }else if(i%7==0){
                System.out.println("How");
            }else{
                System.out.println(i);
            }
        }
         */

        //18
        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        Random random = new Random();
        for(int i=0; i<=a-1; i++){
            for(int j=0; j<=b-1; j++){
                arr[i][j]= random.nextInt(100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        int min = 0;
        int minlocationI = 0;
        int minlocationJ = 0;
        int max = 0;
        int maxlocationI = 0;
        int maxlocationJ = 0;
        min=arr[0][0];
        for(int i=0; i<=a-1; i++){
            for(int j=0; j<=b-1; j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                    maxlocationI= i;
                    maxlocationJ= j;
                }
                if(arr[i][j]<min){
                    min=arr[i][j];
                    minlocationI= i;
                    minlocationJ= j;
                }
                arr[i][j]= random.nextInt(100);
            }
        }
        System.out.println(max + " " + maxlocationI + " " + maxlocationJ);
        System.out.println(min + " " + minlocationI + " " + minlocationJ);
         */

        //19
        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        Random random = new Random();
        for(int i=0; i<=a-1; i++){
            for(int j=0; j<=b-1; j++){
                arr[i][j]= random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        int sum = 0;
        for(int i=0; i<=a-1; i++){
            for(int j=0; j<=b-1; j++){
                if(i==j){
                    sum+=arr[i][j];
                    System.out.println(arr[i][j] + "f");
                }else if(a-1-i==j){
                    sum+=arr[a-1-i][j];
                    System.out.println(arr[i][j] + "w");
                }
            }
        }
        System.out.println(arr[a-1][0] + "e");
        System.out.println(sum);
        */

        //20
        /*
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int[][] arr = new int[a][b];
        Random random = new Random();
        for(int i=0; i<=a-1; i++){
            for(int j=0; j<=b-1; j++){
                arr[i][j]= random.nextInt(10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int[][] arr2 = new int[a][b];
        for(int i=0; i<=a-1; i++){
            for(int j=0; j<=b-1; j++){
                arr2[i][j]= arr[j][i];
                System.out.print(arr[j][i] + " ");
            }
            System.out.println(" ");
        }
         */
    }
}