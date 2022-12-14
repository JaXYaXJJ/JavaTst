package ClassWork.aviExecutorFramework;

import Thread.threadCooperation.Link;

public class Indexer implements Runnable{

    private Link weblink;
    public Indexer(Link weblink) {
        this.weblink = weblink;
    }

    @Override
    public void run() {

        while (true) {

            String htmlPage = weblink.getHtmlPage();

            if (htmlPage != null) {
                indexing(htmlPage);
                break;
            }
            else {
                System.out.println(weblink.getId() + " wasn't downloaded yet...");
            }
        }
    }

    private void indexing(String text) {
        System.out.println("################################ INDEXING ###########################################");
        System.out.println("Indexed " + weblink.getId());
        System.out.println("################################ INDEXING ############################################");
    }
}
