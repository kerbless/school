public class EsempioDiThread implements Runnable {

    public EsempioDiThread() {
        Thread primoT = Thread.currentThread(); // In questo caso il currentThread è quello "base" creato all'inizio del programma
        System.out.println("Primo thread:" + primoT);
        Thread nuovoT = new Thread(this, "Thread figlio");
        System.out.println("\tThread figlio:" + nuovoT);

        nuovoT.start(); // Esegue il metodo run

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException per primoT");
        }
        System.out.println("Terminata esecuzione primoT");
    }


    @Override
    public void run() {
        try {
            for(int i = 1; i < 5; i++) {
                System.out.println("\t\t"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("\t\tInterruptedException per nuovoT");
        }
        System.out.println("\t\tTerminata esecuzione nuovoT");
    }

    public static void main(String args[]) {
        new EsempioDiThread();
    }
}
