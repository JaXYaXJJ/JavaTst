package DesignPatterns.SimpleFactory;

import java.time.LocalDateTime;

public abstract class Post {

    private Long id;
    private String title;
    private String content;
    private LocalDateTime createdOn;
    private LocalDateTime publishedOn;

    private Long getId() {
        return id;
    }

    public Post setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Post setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public Post setContent(String content) {
        this.content = content;
        return this;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public Post setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public LocalDateTime getPublishedOn() {
        return publishedOn;
    }

    public Post setPublishedOn(LocalDateTime publishedOn) {
        this.publishedOn = publishedOn;
        return this;
    }
}
