class Bank {
    int balance = 1000;

    synchronized void deposit(int deposit) {
        balance += deposit;
    }

    synchronized void withdraw(int withdraw) {
        balance -= withdraw;
    }
}

public class Q19Bank {
    public static void main(String[] args) throws InterruptedException {
        Bank b = new Bank();

        Thread t1 = new Thread(() -> b.deposit(500));
        Thread t2 = new Thread(() -> b.withdraw(300));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + b.balance);
    }
}