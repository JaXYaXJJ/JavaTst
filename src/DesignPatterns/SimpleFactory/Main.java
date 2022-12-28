package DesignPatterns.SimpleFactory;

public class Main {
    public static void main(String[] args) {

        Post post = PostFactory.createPost("news");
        Post postBlog = PostFactory.createPost("blog");

        System.out.println(post);
        System.out.println(postBlog);
    }
}
