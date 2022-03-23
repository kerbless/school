import java.util.Scanner;

public class ThreadBenvenuto implements Runnable{

    public ThreadBenvenuto() {
        Thread T1 = new Thread(this, "T1");
        Thread T2 = new Thread(this, "T2");
        Thread T3 = new Thread(this, "T3");
        T1.start();
        T2.start();
        T3.start();
    }


    @Override
    public void run() {
        Scanner input = new Scanner(System.in);
        synchronized (this) {
            System.out.print("Inserisci il tuo nome: ");
            String nome = input.nextLine();
            System.out.print("Benvenuto ");
            System.out.println(nome);
        }

        /* non sincronizzato "non funziona"
        System.out.print("Inserisci il tuo nome: ");
        String nome = input.nextLine();
        System.out.print("Benvenuto ");
        System.out.println(nome);
         */
    }

    public static void main(String[] args) {
        new ThreadBenvenuto();
    }
}
