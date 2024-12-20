public class BookIssuer extends Employee{
    private String issueTime;
    public BookIssuer(String firstName, String lastName, int id, String issueTime){
        super(firstName, lastName, id);
        this.issueTime = issueTime;
    }

    @Override
    public String toString(){
        return super.toString() + " Issue Time: " + issueTime;
    }
}
