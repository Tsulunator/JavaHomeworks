import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1
        /*
        String str = "Hello123World456";
        int digitCount = 0;
        for (char ch : str.toCharArray()){
            if (Character.isDigit(ch)){
                digitCount++;
            }
        }
        System.out.println(digitCount);
         */

        //2
        /*
        String text = "Hello! How are you? I am fine. What about you; All good!";
        int sentenceCount = 0;
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if (ch == '.' || ch == '?' || ch == '!' || ch == ';'){
                sentenceCount++;
            }
        }
        System.out.println(sentenceCount);
         */

        //3
        /*
        String str = "madam";
        boolean isPalindrome = true;
        int length = str.length();
        for (int i=0; i<length/2; i++){
            if (str.charAt(i) != str.charAt(length - 1 - i)){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
         */

        //4
        /*
        String s1 = "hello world";
        String s2 = "world";
        boolean isSubstring = s1.contains(s2);
        System.out.println(isSubstring);
         */

        //5
        /*
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char lastChar = str.charAt(str.length() - 1);
        lastChar = Character.toLowerCase(lastChar);
        if (lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u'){
            System.out.println("Xmovani");
        }else if (Character.isLetter(lastChar)){
            System.out.println("Tanxmovani");
        }else{
            System.out.println("No letter");
        }
         */

        //6
        /*
        Scanner scanner = new Scanner(System.in);
        String newWord = scanner.nextLine();
        String originalWord = "";
        for (int i=0; i<newWord.length(); i+=2){
            originalWord += newWord.substring(i, i + 1);
        }
        System.out.println(originalWord);
         */

        //7
        /*
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        if (word.length() > 10){
            String result = word.charAt(0)+Integer.toString(word.length() - 2)+word.charAt(word.length() - 1);
            System.out.println(result);
        } else {
            System.out.println();
        }
         */
    }
}