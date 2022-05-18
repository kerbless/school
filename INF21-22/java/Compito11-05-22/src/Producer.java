public class Producer implements Runnable {
    Shared m;
    String input;

    Producer(Shared m, String input) {
        this.m = m;
        this.input = input;
        new Thread(this, "producer").start();
    }

    @Override
    public void run() {
        System.out.println("Started thread " + Thread.currentThread().getName());
        for(int i = 0; i < input.length(); i++) {
            m.push((int) input.charAt(i));
        }
    }


}
