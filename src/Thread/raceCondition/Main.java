package Thread.raceCondition;

public class Main {
    public static void main(String[] args) {

        BankAccount task = new BankAccount();
        task.setBalance(1000);

        Thread omer = new Thread(task);
        Thread danna = new Thread(task);

        omer.setName("Omer");
        danna.setName("Danna");

        omer.start();
        danna.start();
    }
}
