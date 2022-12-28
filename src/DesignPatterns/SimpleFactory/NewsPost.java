package DesignPatterns.SimpleFactory;

import java.time.LocalDateTime;

public class NewsPost extends Post {

    private String headline;
    private LocalDateTime newsTime;

    public String getHeadline() {
        return headline;
    }

    public NewsPost setHeadline(String headline) {
        this.headline = headline;
        return this;
    }

    public LocalDateTime getNewsTime() {
        return newsTime;
    }

    public NewsPost setNewsTime(LocalDateTime newsTime) {
        this.newsTime = newsTime;
        return this;
    }
}
