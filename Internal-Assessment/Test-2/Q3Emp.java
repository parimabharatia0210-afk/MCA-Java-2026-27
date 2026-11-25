class Q3Emp {
    public static void main(String[] args) {

        String name = "Areen";
        String salary = "32500.50";
        double annualSal = 0;

        double a = Double.parseDouble(salary);

        System.out.println("Converted: " + a);

        annualSal = a * 12;

        System.out.println("Annual salary: " + annualSal);

        System.out.println("Whole number: " + Math.round(annualSal));

        String lower = name.toLowerCase();
        int count = name.length();

        System.out.println(lower + " " + count);
    }
}