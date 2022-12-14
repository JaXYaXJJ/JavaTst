package Thread.executerFramework;

public class Main {

    public static void main(String[] args) {

        Crawler crawler = new Crawler();

        crawler.addLink(
                crawler.createLink(1000,"Interface VS Abstract Class","https://mkyong.com","mkyong.com")
        );

        crawler.addLink(
                crawler.createLink(1001,"What are Generics in Java","https://stackoverflow.com/questions/7815528/what-are-generics-in-java","http://stackoverflow.com")
        );

        crawler.addLink(
                crawler.createLink(1002,"Virtual Hosting","https://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html","http://tomcat.apache.org")
        );

        crawler.execute();
    }
}
