import java.util.Scanner;
class arithematicOperation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("1: addition\n2: subtraction\n3: multiplication\n4: division");
        System.out.println("Enter the choice: ");
        
        int choice = sc.nextInt();

        if (choice == 1){
            System.out.println(a + b);
        }
        if(choice == 2){
            System.out.println(a - b);
        }
        if(choice == 3){
            System.out.println(a * b);
        }
        if(choice == 4){
            System.out.println(a / b);
        }

        sc.close();
    }
}