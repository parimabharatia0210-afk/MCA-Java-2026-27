interface CalculateResult {
    void calculateTotal();
    void calculatePercentage();
    void calculateGrade();
}

class Q16Student implements CalculateResult {
    int m1 = 80, m2 = 75, m3 = 90;
    int total;
    double percentage;
    char grade;

    public void calculateTotal() {
        total = m1 + m2 + m3;
        System.out.println("Total Marks: " + total);
    }

    public void calculatePercentage() {
        percentage = total / 3.0;
        System.out.println("Percentage: " + percentage + "%");
    }

    public void calculateGrade() {
        if (percentage >= 80)
            grade = 'A';
        else if (percentage >= 60)
            grade = 'B';
        else if (percentage >= 40)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Q16Student s = new Q16Student();
        s.calculateTotal();
        s.calculatePercentage();
        s.calculateGrade();
    }
}
