import java.util.Scanner;

public class Q7ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 5000;

        System.out.println("1. Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Balance = " + balance);
                break;

            case 2:
                System.out.print("Enter amount: ");
                double deposit = sc.nextDouble();
                balance = balance + deposit;
                System.out.println("Balance = " + balance);
                break;

            case 3:
                System.out.print("Enter amount: ");
                double withdraw = sc.nextDouble();

                if (withdraw <= balance) {
                    balance = balance - withdraw;
                    System.out.println("Balance = " + balance);
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;

            case 4:
                System.out.println("Exit");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}