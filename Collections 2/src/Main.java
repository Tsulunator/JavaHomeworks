import java.util.HashMap;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        //1
        /*
        String[] words = {"a", "b", "b", "c", "c", "d"};
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            if(wordCount.containsKey(word)){
                wordCount.put(word, wordCount.get(word)+1);
            }else{
                wordCount.put(word, 1);
            }
        }

        for(String key : wordCount.keySet()){
            System.out.println(key + ":" + wordCount.get(key));
        }
         */


        //2 da 3
        Student student1 = new Student("420", "White", "Brown");
        student1.addPoints("English", 1);
        student1.addPoints("English", 4);
        student1.addPoints("English", 7);
        student1.addPoints("Math", 9);
        student1.addPoints("Math", 8);
        Student student2 = new Student("024", "Brown", "White");
        student2.addPoints("English", 5);
        student2.addPoints("English", 8);
        student2.addPoints("Math", 7);
        student2.addPoints("Math", 6);

        int Result = student1.compareTo(student2);
        if (Result > 0){
            System.out.println(student1.getFirstName()+" "+student1.getLastName()+" is higher");
        }else if(Result < 0){
            System.out.println(student2.getFirstName()+" "+student2.getLastName()+" is higher");
        }else{
            System.out.println("Equal");
        }
    }
}