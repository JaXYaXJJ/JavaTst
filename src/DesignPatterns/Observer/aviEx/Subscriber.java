package DesignPatterns.Observer.aviEx;

import java.util.ArrayList;
import java.util.List;

public class Subscriber {

    private String name;
    private List<Channel> channels;

    public Subscriber(String name) {
        this.name = name;
        this.channels = new ArrayList<>();
    }

    public void update(String channelName) {
        System.out.println("Hey! " + name + " new video was uploaded on " + channelName);
    }

    public void addChannel(Channel channel) {
        channels.add(channel);
    }
}
