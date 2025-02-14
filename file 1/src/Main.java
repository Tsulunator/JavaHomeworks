import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //1
        /*
        String[] lines = {"I can't copy", "that", ":("};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
            for (String line : lines){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("done");
        }catch (IOException e){
            System.out.println("Error");
        }
         */

        //2
        /*
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] words = line.split("\\s+");
                count += words.length;
            }
            System.out.println(count);
        } catch (IOException e) {
            System.out.println("error");
        }
         */

        //3
        /*
        Scanner scanner = new Scanner(System.in);
        String searchWord = scanner.nextLine().trim();
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                String[] words = line.split("\\s+");
                for (String word : words){
                    if (word == searchWord){
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
            System.out.println(found ? "Found" : "Not found");
        } catch (IOException e) {
            System.out.println("Failed to read.");
        }
         */

        //4
        /*
        String text = """
            ASSURE POLITE HIS REAL AND OTHER FIGURES THOUGH. DAY AGE ADVANTAGES
            AND SUFFICIENT EATING EXPRESSION TRAVELING. OF ON AM FATHER BY AGREED
            SUPPLY RATHER EITHER. OWN HANDSOME DELICATE PROPERTY MISTRESSES HER
            END APPETITE. MEAN ARE SONS TOO SOLD NOR SAID. SON SHARE THREE MEN
            POWER BY YOU. NOW MERITS WONDER EFFECT GARRET OWN.
            """;

        String upperText = text.toUpperCase();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("something.txt"))){
            writer.write(upperText);
            System.out.println("done");
        } catch (IOException e){
            System.out.println("Failed");
        }
         */
    }
}