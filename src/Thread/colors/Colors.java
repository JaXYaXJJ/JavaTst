package Thread.colors;

public class Colors {

    //Shell
    public static String RED = "\u001b[31m";
    public static String GREEN = "\u001b[32m";
    public static String YELLOW = "\u001b[33m";
    public static String BLUE = "\u001b[34m";
    public static String PURPLE = "\u001b[35m";


    public static void main(String[] args) {

        Countdown c = new Countdown();

        new Thread( ()-> c.doCountdown() ).start();
        new Thread( ()-> c.doCountdown() ).start();
    }
}

