public class Produttore implements Runnable {
    Vassoio v;

    public Produttore(Vassoio unVassoio) {
        v = unVassoio;
        new Thread(this, "Produttore").start();
    }

    @Override
    public void run() {
        for (int i = 45; i < 55; i++) {
            v.metti(i);
        }
    }
}
