public class Fantasy extends Book {
    private String country;

    public Fantasy(String title, int numberOfPages, String author, boolean isHardcover, String country){
        super(title, numberOfPages, author, isHardcover);
        this.country = country;
    }


    public String toString(){
        return super.toString() + " Mythological "  + country;
    }
}