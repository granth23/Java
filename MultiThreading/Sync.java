import java.util.Random;

public class Sync {

    private int balance;

    public Sync(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount, int accountId) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " by Account " + accountId + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal by Account " + accountId);
        }
    }

    public synchronized void deposit(int amount, int accountId) {
        balance += amount;
        System.out.println("Deposit of " + amount + " by Account " + accountId + " | New Balance: " + balance);
    }

    public static void main(String[] args) {
        Sync account = new Sync(100);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 25; i++) {
                    account.withdraw(10, 1);
                    try {
                        Thread.sleep(150);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 25; i++) {
                    account.deposit(5, 2);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
    }

}
