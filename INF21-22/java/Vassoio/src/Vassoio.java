public class Vassoio {
    int unDato;
    boolean empty = true;

    synchronized void prendi() {
        if(empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread() + " Preso: " + unDato);
        empty = true;
        notify();
    }
    synchronized void metti(int d) {
        if(!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        unDato = d;
        System.out.println(Thread.currentThread() + " Depositato: " + d);
        empty = false;
    }
}
