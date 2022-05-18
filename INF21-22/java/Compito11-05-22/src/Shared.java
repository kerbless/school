public class Shared {
    int data; // holds character int value
    boolean empty = true; // true if data is ready for a push
    boolean even; // true if data is even
    boolean off; // true if data is the int value of a dot "."

    synchronized void push(int data) { // gets data from producer and updates even / off
        if(!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " accessed shared memory");
        this.data = data;
        even = data % 2 == 0;
        off = data == 46;
        empty = false;
        notify();
    }

    synchronized int pull(boolean even) { // gives data to consumer
        if(empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " accessed shared memory");
//        if (this.even != even)  {
//            try {
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }
        if(!off && this.even == even) empty = true;
        notify();
        return data;
    }
}
