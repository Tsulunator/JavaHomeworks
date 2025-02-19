import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.next();
        String lastName = scanner.next();
        int age = scanner.nextInt();
        Human person1 = new Human(firstName, lastName, age);
        Human person2 = new Human("Guy", "yuG", 3);
        person1.walk();
        person1.hangOut(person2);
        scanner.close();
    }
}