import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Distributore d = new Distributore();
        Scanner in = new Scanner(System.in);
        int choice;
        do {
            menu();
            d.stato();
            System.out.print("Inserisci la tua scelta: ");
            choice = in.nextInt(); in.nextLine();
            switch (choice) {
                case 0:
                    break;
                case 1:
                    d.stato();
                    break;
                case 2:
                    d.accendi();
                    break;
                case 3:
                    d.inserisci();
                    break;
                case 4:
                    d.prendi_caffe();
                    break;
                case 5:
                    d.prendi_cappuccino();
                    break;
                case 6:
                    d.restituisci();

                    break;
                case 7:
                    d.ricarica();
                    break;
                case 8:
                    d.svuota_gettoniera();
                    break;
                default:
                    System.out.println("L'opzione inserita non esiste");
            }
        } while (choice != 0);

    }
    private static void menu() {
        System.out.println("\n0. Esci");
        System.out.println("1. Stato");
        System.out.println("2. Accendi");
        System.out.println("3. Inserisci (+credito)");
        System.out.println("4. Prendi caffe'");
        System.out.println("5. Prendi cappuccino");
        System.out.println("6. Restituzione");
        System.out.println("8. Svuota gettoniera");
        System.out.println("7. Ricarica");
    }
}
