public class Tray {
    String ordination;
    boolean empty = true;

    synchronized String pull() {
        if(empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[pull] -> " + ordination);
        empty = true;
        notify();
        return ordination;
    }

    synchronized void push(String ordination) {
        if(!empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("[push]");
        this.ordination = ordination;
        empty = false;
        notify();
    }
}
