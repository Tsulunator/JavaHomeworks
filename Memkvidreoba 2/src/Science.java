public class Science extends Book{
    private String field;

    public Science(String title, int numberOfPages, String author, boolean isHardcover, String field){
        super(title, numberOfPages, author, isHardcover);
        this.field = field;
    }

    public String toString(){
        return super.toString() + " Science " + field;
    }
}