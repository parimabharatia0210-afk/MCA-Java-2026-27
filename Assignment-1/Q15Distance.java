class Q15Distance {
    double feet, inches;

    Q15Distance(double f, double i) {
        feet = f;
        inches = i;
    }

    void getValue(double f, double i) {
        feet = f;
        inches = i;
    }

    void showDistance() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }

    double centi() {
        return ((feet * 12) + inches) * 2.54;
    }

    void display() {
        showDistance();
        System.out.println("Centimeters: " + centi() + " cm");
    }

    public static void main(String[] args) {
        Q15Distance d1 = new Q15Distance(5, 8);
        Q15Distance d2 = new Q15Distance(6, 4);

        d1.display();
        d2.display();
    }
}
