package DesignPatterns.SimpleFactory;

public class BlogPost extends Post {

    private String author;
    private String[] tags;

    public String getAuthor() {
        return author;
    }

    public BlogPost setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String[] getTags() {
        return tags;
    }

    public BlogPost setTags(String[] tags) {
        this.tags = tags;
        return this;
    }
}
