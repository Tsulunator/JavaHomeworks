import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //1
        /*
        List<Integer> numbers = Arrays.asList(5, 10, 15, 20, 25, 30);
        int result = numbers.stream()
                .filter(n -> n % 10 != 0)
                .map(n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(result);
         */

        //2
        /*
        List<String> words = Arrays.asList("Glock", "Deagle", "Magnum", "Jamal");
        List<String> result = words.stream()
                .filter(word -> word.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(result);
         */

        //3
        /*
        Set<String> result = Arrays.asList("CC", "BB", "CC", "AA", "DD")
                .stream()
                .sorted()
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result);
         */

        //4
        /*
        List<Human> people = Arrays.asList(
                new Human("Levani", 20),
                new Human("Davit", 14),
                new Human("Giorgi", 18),
                new Human("Levani", 10));
        boolean Levani = people.stream()
                .filter(human->human.getAge()>=15)
                .anyMatch(human->human.getName().equals("Levani"));
        System.out.println(Levani);
         */

        //5
        /*
        List<Integer> numbers = Arrays.asList(5, 2, 8, 3, 7, 2, 10, 8);
        int secondSmallest = numbers.stream()
                .sorted()
                .skip(1)
                .findFirst()
                .get();
        int secondLargest = numbers.stream()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(secondSmallest);
        System.out.println(secondLargest);
         */
    }
}