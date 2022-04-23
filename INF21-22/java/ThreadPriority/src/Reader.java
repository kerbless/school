public class Reader implements Runnable {
    long read = 0;
    private Thread reader;
    private boolean ongoing = false;

    public Reader(int p) {
        reader = new Thread(this);
        reader.setPriority(p);
        reader.start();
    }

    public void run() {
        while(ongoing) read++;
    }

    public void start() {
        this.read = 0;
        ongoing = true;
    }

    public void stop() {
        ongoing = false;
    }
}
