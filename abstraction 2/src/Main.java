public class Main {
    public static void main(String[] args) {
        Music song1 = new Music("Thick Of It", 30, "Thick");
        Music song2 = new Music("Thin Of It", 3, "Thin");
        Album album1 = new Album("KSI album", 2024);
        Artist artist1 = new Artist("KSI");
        album1.addMusic(song1);
        album1.addMusic(song2);
        artist1.addAlbum(album1);
        MusicLibrary library = new MusicLibrary();
        library.addArtist(artist1);
        library.searchMusic("Thick Of It");
        Music randomSong = library.giveRandomMusic();
        System.out.println("Random song:");
        randomSong.displayInfo();
        randomSong.play();
        randomSong.stop();
    }
}