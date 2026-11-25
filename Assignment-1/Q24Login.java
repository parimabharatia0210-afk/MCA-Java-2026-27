import java.util.Scanner;

class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}

public class Q24Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            if (!username.equals("admin") || !password.equals("1234")) {
                throw new InvalidLoginException("Invalid Login!");
            }

            System.out.println("Login Successful!");

        } catch (InvalidLoginException e) {
            System.out.println(e.getMessage());
        }

        
    }
}
