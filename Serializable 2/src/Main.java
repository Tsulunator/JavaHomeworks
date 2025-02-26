import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneContact[] contacts = new PhoneContact[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1);
            String firstName = scanner.nextLine();
            String lastName = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            String email = scanner.nextLine();
            contacts[i] = new PhoneContact(
                    firstName,
                    lastName,
                    phoneNumber,
                    email
            );
        }

        for (PhoneContact contact : contacts){
            System.out.println(contact);
        }
        System.out.println();

        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contacts.txt"))
        ){
            oos.writeObject(contacts);
        } catch (IOException e){
            System.out.println(e);
        }

        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contacts.txt"))
        ){
            PhoneContact[] array = (PhoneContact[]) ois.readObject();

            for (PhoneContact contact : array){
                System.out.println(contact);
            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e);
        }
    }
}