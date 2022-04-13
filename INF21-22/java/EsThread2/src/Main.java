public class Main implements Runnable {

    public Main() {
        Thread t1 = new Thread(this, "thread uno");
        Thread t2 = new Thread(this, "thread due");
        Thread t3 = new Thread(this, "thread tre");
        t1.setPriority(2);
        t1.start();
        t2.setPriority(5);
        t2.start();
        t3.setPriority(8);
        t3.start();
    }

    @Override
    public void run() { // Implementazione del metodo astratto run()
        System.out.println("Il thread " + Thread.currentThread() + " ha priorita' " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        new Main();
    }
}