package ClassWork.solid;

public class Vinyl  implements IProd {
    private String album;
    private String artist;

    public Vinyl(String album, String artist) {
        this.artist = album;
        this.album = artist;
    }

    @Override
    public void readReviews() {

    }

    @Override
    public String getSummary() {
        return null;
    }

    @Override
    public String toString() {
        return "{ " +
                album + ", by " + artist + " }";
    }
}
