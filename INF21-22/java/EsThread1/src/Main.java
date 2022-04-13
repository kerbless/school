public class Main implements Runnable {

    public Main() {
        new Thread(this, "nome simbolico").start();
    }

    @Override
    public void run() { // Implementazione del metodo astratto run()
        System.out.print("Il thread " + Thread.currentThread() + " ha priorita' " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        new Main();
    }
}
