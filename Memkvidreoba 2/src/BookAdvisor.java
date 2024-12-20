import java.util.ArrayList;
import java.util.Random;

public class BookAdvisor extends Employee {
    private Library library;

    public BookAdvisor(String firstName, String lastName, int id, Library library){
        super(firstName, lastName, id);
        this.library = library;
    }

    public Book recommendBook(){
        ArrayList<Book> books = library.getBooks();
        Random random = new Random();
        return books.get(random.nextInt(books.size()));
    }
}