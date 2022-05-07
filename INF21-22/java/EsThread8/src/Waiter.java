public class Waiter implements Runnable {
    Tray t;

    public Waiter(Tray t) {
        this.t = t;
        new Thread(this, "Waiter").start();
    }

    @Override
    public void run() {
        t.push("Spaghetti, Water");
        t.push("Beef, Chips, Water x2");
        t.push("Beef, Water x2");
        t.push("Pizza, Chips, Water");
        t.push("Pizza x4, Water x3");
        t.push("Pizza no tomato, Chips, Water");
    }
}
