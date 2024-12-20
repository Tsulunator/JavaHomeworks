public class Main {
    public static void main(String[] args) {
        Library library = new Library("Brainrot Library");

        Bookkeeper bookkeeper = new Bookkeeper("John", "Pork", 1);
        BookIssuer bookIssuer = new BookIssuer("Bobby", "Bob", 2, "10 AM");
        BookAdvisor bookAdvisor = new BookAdvisor("White", "Browny", 3, library);

        library.addEmployee(bookkeeper);
        library.addEmployee(bookIssuer);
        library.addEmployee(bookAdvisor);

        Book book1 = new Book("The Most Normal Book Known To Mankind", 100, "Dr. Bright", true);
        Science science = new Science("Physics", 200, "SCP 049", false, "Physics");
        Fantasy fantasy = new Fantasy("Legends", 345762, "Kratos", true, "Greece");

        library.addBook(book1);
        library.addBook(science);
        library.addBook(fantasy);

        Book recommendedBook = bookAdvisor.recommendBook();
        System.out.println("Recommended Book: " + recommendedBook);
    }
}