// Write a class rectangle with properties width and height with necessory methods
public class rectangle {
    void area(int l, int b){
        System.out.println("Area of rectangle is: "+l * b);
    }
    
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.area(10,20);
    }
}
