import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Employee> staff;
    private ArrayList<Book> books;

    public Library(String name){
        this.name = name;
        this.staff = new ArrayList<>();
        this.books = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        staff.add(employee);
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public String toString(){
        return "Name: " + name;
    }
}