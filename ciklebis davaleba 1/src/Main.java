

public class Main{
    public static void main(String[] args){
        //1
        /*
        int Numba = 0;
        for (int i = 10; i <= 100; i += 5){
            Numba += i;
        }
        System.out.println(Numba);
         */

        //2
        /*
        int Numba = 84695;
        int answear = 0;
        for (int i = Numba; i>0; i /= 10){
            answear+=1;
        }
        System.out.println(answear);
        */

        //3
        /*
        int numba = 3;
        int answear = 0;
        for (int i = 1; i <=numba; i+=1 ){
            if(numba%i==0){
                answear +=1;
                System.out.println(answear);
            }
        }
        if(answear<=2){
            System.out.println("Yuh uh"); // arvici tu 1 itvleba martivad tu itvleba kide ert ifs davamatebdi
        }else{
            System.out.println("Nuh uh");
        }
         */

        //4
        /*
        int a=27;
        int b=9;
        int bignumba;
        int common;
        if(a>=b){
            bignumba=a;
        }else{
            bignumba=b;
        }
        for (int i = bignumba; i>=0; i-=1){
            if(a%i==0 && b%i==0){
                System.out.println(i);
                break;
            }
        }
         */

        //5
        /*
        for (int num = 100; num <= 999; num++){
            int hundred = num / 100;
            int ten = (num / 10)%10;
            int one = num % 10;
            if(num%(hundred+ten+one)==0){
                System.out.println(num);
            }
        }
        */

        //6
        /*
        int first = 0;
        int second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 3; i <= 10; i++) {
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
         */
    }
}