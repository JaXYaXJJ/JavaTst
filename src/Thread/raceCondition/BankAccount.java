package Thread.raceCondition;

public class BankAccount implements Runnable {

    private int balance;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    private void withdrawMoney(int amount) {

        if (balance >= amount) {
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " is about to withdraw " + amount);
            balance -= amount;
            System.out.println("Thread " + Thread.currentThread().getName()
                    + " has withdraw " + amount);
        }
    }

    @Override
    public void run() {

        //This is the task
        withdrawMoney(750);

        if (balance < 0)
            System.out.println("Money overdraw!");
            System.out.println("Balance : " + balance);
    }
}
