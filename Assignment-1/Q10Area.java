import java.util.Scanner;

class Q10Area {

    final double pi = Math.PI;
    int r;
    double area;

    void cal_area() {
        area = pi * r * r;
    }

    void display() {
        System.out.println("Area of circle = " + area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        Q10Area obj = new Q10Area();

        obj.r = sc.nextInt();

        obj.cal_area();
        obj.display();

        sc.close();
    }
}