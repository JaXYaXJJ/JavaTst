package Thread.executerFramework;

import java.io.IOException;
import java.util.concurrent.Callable;

public class Downloader<T extends Link> implements Callable<T> {

    private T weblink;

    public Downloader(T weblink) {
        this.weblink = weblink;
    }

    @Override
    public T call() {

        try {
            //Local variable
            String htmlPage = HttpClass.downloadWebPage(weblink.getUrl());

            //Updating shared volatile variable
            weblink.setHtmlPage(htmlPage);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return weblink;
    }
}
