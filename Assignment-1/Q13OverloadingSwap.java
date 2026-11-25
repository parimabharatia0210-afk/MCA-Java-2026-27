public class Q13OverloadingSwap {
    int a, b;
    void s(){
        int temp=a;
        a=b;
        b=temp;
    }
    void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    void swap(float a, float b) {
        float temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    void swap(char a, char b) {
        char temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Q13OverloadingSwap s = new Q13OverloadingSwap();

        s.swap(10, 20);
        s.swap(2.5f, 5.5f);
        s.swap('A', 'B');
    }
}
