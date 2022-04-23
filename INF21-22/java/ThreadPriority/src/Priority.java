import java.text.DecimalFormat;

public class Priority {
    public static void main(String[] args) {
        Reader highPriority = new Reader(Thread.NORM_PRIORITY + 2);
        Reader lowPriority = new Reader(Thread.NORM_PRIORITY - 2);
        int tests = 255, positives = 0, sleep = 5;
        for(int i = 0; i < tests; i++) {
            highPriority.start();
            lowPriority.start();
            try {
                Thread.sleep(sleep);
            } catch (Exception ignored) {
            }
            highPriority.stop();
            lowPriority.stop();
            if(highPriority.read > lowPriority.read) positives++;
            //System.out.println("High priority reader has a read value of: " + highPriority.read);
            //System.out.println("Low priority reader has a read value of: " + lowPriority.read);
            //System.out.println("Is high priority greater? [" + (highPriority.read > lowPriority.read) + "] by " + (highPriority.read - lowPriority.read));
        }
        float percentage = ((float)positives/tests*100);
        DecimalFormat df = new DecimalFormat("##.#");
        System.out.println("Performed " + tests + " tests with a sleep time of " + sleep + "ms. The highPriority tread worked more in " + positives + " tests [" + df.format(xzpercentage) + "%]");
    }
}
