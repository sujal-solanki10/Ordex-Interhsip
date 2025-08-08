
import java.util.ArrayList;
import java.util.Random;

class MusicLibrary {

    private ArrayList<Song> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(Song s) {
        songs.add(s);
    }

    public void removeMusic(Song s) {
        songs.remove(s);
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void playRandomSong() {
        int size = songs.size();

        if (size == 0) {
            System.out.println("No songs in the library.");
            return;
        }
        Random rand = new Random();

        int index = rand.nextInt(size);
        System.out.println("Now playing: " + songs.get(index).getTitle() + " by " + songs.get(index).getArtist());

    }
}

class Song {

    private String title;
    private String artist;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

}

public class MusicMain {

    public static void main(String[] args) {

        MusicLibrary library = new MusicLibrary();

        library.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        library.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        library.addSong(new Song("Imagine", "John Lennon"));
        library.addSong(new Song("All by Myself", "Eric Carmen"));
        library.addSong(new Song("What'd I Say", "Ray Charles"));
        library.addSong(new Song("Walking in Memphis", "Marc Cohn"));
        library.addSong(new Song("In the Air Tonight", "Phil Collins"));

        System.out.println();
        System.out.println("All songs:");

        for (Song song : library.getSongs()) {
            System.out.println(song.getTitle() + " by " + song.getArtist());
        }
        System.out.println("\n**Playing Random Song**");
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
        System.out.println();
        library.playRandomSong();
        System.out.println();
    }

}
