import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Country> countries = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
            countries.add(new Country(input.next(), input.nextInt(), input.nextDouble()));
        }
        try(FileOutputStream outfile = new FileOutputStream("src/countries.txt");
            ObjectOutputStream outobject = new ObjectOutputStream(outfile)
        ){
            outobject.writeObject(countries);
        }catch (IOException e){
            System.out.println(e);
        }
        try(
                FileInputStream infile = new FileInputStream("src/countries.txt");
                ObjectInputStream inobject = new ObjectInputStream(infile)
        ){
            List<Country> deserializedCountries = (List<Country>) inobject.readObject();
            for (Country country : deserializedCountries){
                System.out.println(country);}
        }catch (IOException e){
            System.out.println(e);
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }
}