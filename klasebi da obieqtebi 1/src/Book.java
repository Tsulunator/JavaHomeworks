public class Book{
    String title;
    String author;
    int numberOfPages;

    public Book(String title, String author, int numberOfPages){
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    //2
    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.numberOfPages = 0;
    }

    public void displayBookInfo(){
        System.out.println("book title: " + title);
        System.out.println("author: " + author);
        System.out.println("number of pages: " + numberOfPages);
    }
}