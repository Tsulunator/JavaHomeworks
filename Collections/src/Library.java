import java.util.*;
import java.io.*;

public class Library{
    private ArrayList<Book> books = new ArrayList<>();

    public ArrayList<Book> getBooks(){
        return books;
    }

    public void setBooks(ArrayList<Book> books){
        this.books = books;
    }

    public void populateList(String fileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                String[] parts = line.split(", ");
                if(parts.length == 2){
                    String name = parts[0];
                    int pages = Integer.parseInt(parts[1]);
                    books.add(new Book(name, pages));
                }
            }
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}