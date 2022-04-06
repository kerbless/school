public class Consumatore implements Runnable {
    Vassoio v;

    public Consumatore(Vassoio unVassoio) {
        v = unVassoio;
        new Thread(this, "Produttore").start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            v.prendi();
        }
    }
}
