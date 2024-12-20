public class Book{
    private String title;
    private int numberOfPages;
    private String author;
    private boolean isHardcover;

    public Book(String title, int numberOfPages, String author, boolean isHardcover){
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.author = author;
        this.isHardcover = isHardcover;
    }

    public void read(){
        System.out.println("reading " + title);
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Pages: " + numberOfPages + ", Hardcover: " + isHardcover;
    }
}