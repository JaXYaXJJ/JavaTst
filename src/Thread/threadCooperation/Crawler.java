package Thread.threadCooperation;

import java.util.ArrayList;
import java.util.List;

public class Crawler {

    //Web Crawler - Spider - Indexing - Inverted index

    private List<Link> linksList;

    public Crawler() {
        linksList = new ArrayList<>();
    }

    protected void execute() {

        for (Link link : linksList) {

            Thread downloader = new Thread( new Downloader(link) );
            Thread indexer = new Thread( new Indexer(link) );

            downloader.start();
            indexer.start();
        }
    }

    //Add link to the array list of links
    public void addLink(Link webLink) {
        linksList.add(webLink);
    }

    //Create new Link Object
    public Link createLink(long id, String title, String url, String host) {
        return new Link(id, title, url, host);
    }
}
