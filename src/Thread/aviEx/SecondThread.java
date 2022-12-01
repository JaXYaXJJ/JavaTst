package Thread.aviEx;

public class SecondThread extends Thread {

    @Override
    public void run() {

        System.out.println("We R inside thrRUN method!");

        innerMethod2();
        anotherInnerMethod2();
    }

    private void innerMethod2() {
        System.out.println("2ND THREAD INNER METHOD!");
    }

    private void anotherInnerMethod2() {
        System.out.println("2ND THREAD OTHER INNER METHOD!");
    }
}
