package Thread.threadCooperation;

public class Indexer implements Runnable {

    private Link weblink;
    public Indexer(Link weblink) {
        this.weblink = weblink;
    }

    @Override
    public void run() {

        synchronized (weblink) {

            String htmlPage = weblink.getHtmlPage();

//        while (true) {
//
//            if (htmlPage != null) {
//                indexing(htmlPage);
//                break;
//            }
//            else {
//                System.out.println(weblink.getId() + "Wasn't downloaded yet...");
//            }
//        }

            while (htmlPage == null) {

                try {
                    System.out.println(weblink.getId() + " not yet downloaded...!");
                    weblink.wait();
                    System.out.println(weblink.getId() + " awakened...!!!");
                    htmlPage = weblink.getHtmlPage();

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            indexing(htmlPage);
        }
    }

    private void indexing(String text) {
        System.out.println("########## INDEXING ##########");
        System.out.println("Indexed " + weblink.getId());
        System.out.println("########## INDEXING ##########");
    }
}