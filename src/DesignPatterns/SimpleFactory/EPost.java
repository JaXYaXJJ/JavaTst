package DesignPatterns.SimpleFactory;

public enum EPost {

    NEWS(new NewsPost()),
    BLOG(new BlogPost());

    private Post post;

    EPost(Post post) {
        this.post = post;
    }

    public Post getPost() {
        return post;
    }
}
