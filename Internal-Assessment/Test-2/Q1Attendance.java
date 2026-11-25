class Q1Attendance {
    public static void main(String[] args) {

        int[] arr = {3, 6, 4, 5, 6};

        int total = 0;
        int high = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            total = total + arr[i];

            if (high < arr[i]) {
                high = arr[i];
            }

            if (arr[i] >= 5) {
                count++;
            }
        }

        if (count >= 3) {
            System.out.println("Regular Attendance");
        } else {
            System.out.println("Needs Improvement");
        }

        System.out.println("Total attendance: " + total);
        System.out.println("Highest attendance: " + high);
        System.out.println("5 days or more: " + count);
    }
}