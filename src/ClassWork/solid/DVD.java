package ClassWork.solid;

public class DVD implements IProd {
    private String dvdName;
    private String director;

    public DVD(String dvdName, String director) {
        this.dvdName = dvdName;
        this.director = director;
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
                dvdName + ", by " + director + " }";
    }
}
