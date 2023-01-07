package DesignPatterns.Observer.aviEx;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private List<Subscriber> subs;
    private List<Video> videos;

    public Channel(String name) {
        this.name = name;
        this.subs = new ArrayList<>();
        this.videos = new ArrayList<>();
    }

    public void subscribe(Subscriber sub) {
        subs.add(sub);
    }

    public void unsubscribe(Subscriber sub) {
        subs.remove(sub);
    }

    public void notifySubs() {
        subs.forEach( sub -> sub.update(this.name) );
    }

    public void uploadVideo(String videoTitle) {
        videos.add(new Video(videoTitle));
        notifySubs();
    }
}
