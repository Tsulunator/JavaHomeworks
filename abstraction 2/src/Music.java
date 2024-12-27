public class Music extends Playable{
    private String title;
    private int duration;
    private String genre;

    public Music(String title, int duration, String genre){
        this.title = title;
        this.duration = duration;
        this.genre = genre;
    }

    public void play(){
        System.out.println("Playing: " + title);
    }

    public void stop(){
        System.out.println("Stopping: " + title);
    }

    public void displayInfo(){
        System.out.println("Title: " + title + ", Duration: " + duration + " Genre: " + genre);
    }

    public String getTitle(){
        return title;
    }
}