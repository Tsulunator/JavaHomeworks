import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary{
    // :(

    private List<Artist> artists;
    private List<Album> albums;
    private List<Music> songs;

    public MusicLibrary(){
        this.artists = new ArrayList<>();
        this.albums = new ArrayList<>();
        this.songs = new ArrayList<>();
    }

    public void addArtist(Artist artist){
        artists.add(artist);
    }

    public void removeArtist(Artist artist){
        artists.remove(artist);
    }

    public void searchMusic(String title){
        for(Music song : songs){
            if (song.getTitle() == title){
                song.displayInfo();
                song.play();
                return;
            }
        }
        System.out.println("not found");
    }

    public Music giveRandomMusic(){
        Random random = new Random();
        return songs.get(random.nextInt(songs.size()));
    }
}