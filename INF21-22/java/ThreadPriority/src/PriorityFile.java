import java.io.BufferedWriter;
import java.io.FileWriter;

public class PriorityFile {
    public static void main(String[] args) {
        Reader highPriority = new Reader(Thread.NORM_PRIORITY + 4);
        Reader lowPriority = new Reader(Thread.NORM_PRIORITY - 4);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));

            for(int i = 0; i < 3; i++) {
                highPriority.start();
                lowPriority.start();
                try {
                    Thread.sleep(3000);
                } catch (Exception e) {System.out.println(e);}
                highPriority.stop();
                lowPriority.stop();
                writer.write(String.valueOf(highPriority.read < lowPriority.read) + " ");
                writer.write(highPriority.read + " " + lowPriority.read);
                writer.newLine();
            }

            writer.close();
        } catch (Exception e) {System.out.println(e);}
    }
}
