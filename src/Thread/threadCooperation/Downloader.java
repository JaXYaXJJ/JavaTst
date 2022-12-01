package Thread.threadCooperation;

import java.io.IOException;

public class Downloader implements Runnable {

    private Link weblink;

    public Downloader(Link weblink) {
        this.weblink = weblink;
    }

    @Override
    public void run() {

        try {
            synchronized (weblink) {
                //Local variable
                String htmlPage = HttpClass.downloadWebPage(weblink.getUrl());
                //Updating shared volatile variable
                weblink.setHtmlPage(htmlPage);

                weblink.notify();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
