import java.util.Scanner;

public class CalcThread implements Runnable {
    public CalcThread() {
        Thread T1 = new Thread(this, "T1");
        Thread T2 = new Thread(this, "T2");
        T1.start();
        T2.start();
    }

    @Override
    public void run() {
        Scanner input = new Scanner(System.in);
        int a, b;
        synchronized (this) {
            System.out.print(Thread.currentThread() + " Inserisci primo addendo: ");
            a = input.nextInt();
            System.out.print(Thread.currentThread() + " Inserisci secondo addendo: ");
            b = input.nextInt();
        }
        System.out.println(Thread.currentThread() + " Somma: " + (a+b));
    }

    public static void main(String[] args) {
        new CalcThread();
    }
}