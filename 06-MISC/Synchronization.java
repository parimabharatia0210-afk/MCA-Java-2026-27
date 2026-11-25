public class Synchronization {
    // synchronization using methods to add element in array, get size of the array and print the array
    int capacity;
    int []data;
    int size;

    public Synchronization(int capacity) {
        this.capacity = capacity;
        data = new int[capacity];
        size = 0;
    }

    public void putElement(int e){
        // synchronized method to add element in array
        synchronized(this){
            if(size < capacity){
                data[size] = e;
                size++;
            } else {
                System.out.println("Array is full");
            }
        }
    }
        
}