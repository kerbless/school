import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create class for shared data (critical section)
        Shared m = new Shared();

        // get string input
        Scanner in = new Scanner(System.in);
        String input;
        System.out.print("Inserisci una stringa che termina con un punto: ");
        input = in.nextLine();
        System.out.println("Hai inserito \"" + input + "\", avviamento thread...");

        // start threads with input and shared data class
        Producer producer = new Producer(m, input);
        Consumer consumerOdd = new Consumer(m, false);
        Consumer consumerEven = new Consumer(m, true);
    }
}
