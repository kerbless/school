public class Consumer implements Runnable {
    Shared m;
    boolean even;
    String name;
    int in = 0;
    String out = "";

    Consumer(Shared m, boolean even) {
        this.m = m;
        this.even = even;
        if(even) name = "consumerEven";
        else name = "consumerOdd";
        new Thread(this, name).start();
    }

    @Override
    public void run() {
        System.out.println("[i] Started thread " + Thread.currentThread().getName());
        while(in != 46) {
            in = m.pull(even);
            if((in % 2 == 0 && even) || (in % 2 != 0 && !even)) {
                System.out.println(Thread.currentThread().getName() + " successfully consumed " + (char) in + " [" + in + "]");
                out += (char) in;
            }
        }
        System.out.println("Output of " + Thread.currentThread().getName() + " is " + out);
    }
}
