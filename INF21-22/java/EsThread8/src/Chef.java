public class Chef implements Runnable {
    Tray t;

    public Chef(Tray t) {
        this.t = t;
        new Thread(this, "Waiter").start();
    }

    @Override
    public void run() {
        for(int i = 0; i < 6; i++) {
             t.pull();
        }
    }
}