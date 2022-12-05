package Thread.threadCooperation;

public class Link {

    private long id;
    private String title;
    private String url;
    private String host;

    public Link(long id, String title, String url, String host) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.host = host;
    }

    //Volatile variable - shared variable
    //No race condition - only memory visibility is needed

    //Wait() & Notify() Methods
    private String htmlPage;

    //Setters + Getters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getHtmlPage() {
        return htmlPage;
    }

    public void setHtmlPage(String htmlPage) {
        this.htmlPage = htmlPage;
    }
}
