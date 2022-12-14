package Thread.executerFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Crawler {

    private List<Link> linksList;
    ExecutorService downloadExecutor = Executors.newFixedThreadPool(2);
    ExecutorService indexerExecutor = Executors.newFixedThreadPool(2);

    public Crawler() {
        linksList = new ArrayList<>();
    }

    //Execution of 2 threads, Downloader and Indexer
    protected void execute() {

        List<Future<Link>> futures = new ArrayList<>();

        for (Link link : linksList) {
            futures.add( downloadExecutor.submit( new Downloader<Link>(link) ));
        }

        for (Future<Link> future : futures) {

            try {

                indexerExecutor.execute( new Indexer(future.get()) );

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        downloadExecutor.shutdown();
        indexerExecutor.shutdown();
    }

    //Add link to the array list of links
    public void addLink(Link weblink) {
        linksList.add(weblink);
    }

    //Create new Link Object
    public Link createLink(long id, String title, String url, String host) {

        return new Link(id,title,url,host);
    }
}
