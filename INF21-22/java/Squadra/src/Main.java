/*
sarebbe carino provare a leggere gli int in input con i try-catch e il casting ad int
https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Squadra squadra = null; // will be used to create the team
        int choice;

        // main loop for menu
        do {
            print_menu();
            choice = input.nextInt(); input.nextLine(); // the second input fixes a bug (see SOF)
            switch (choice) {
                case 0:
                    break;
                case 1:
                    if (squadra == null) {
                        System.out.print("Inserisci il nome della squadra: ");
                        String tmp_input_name = input.nextLine();

                        System.out.print("Inserisci la citta' della squadra: ");
                        String tmp_input_citta = input.nextLine();
                        squadra = new Squadra(tmp_input_name, tmp_input_citta);
                    }
                    else System.out.println("Hai gia' creato la tua squadra!");
                    break;
                case 2:
                    if (squadra != null) {
                        boolean success;
                        do {
                            System.out.println();
                            System.out.println(" - 0. persa");
                            System.out.println(" - 1. pareggio");
                            System.out.println(" - 3. vinta");
                            System.out.print("Inserisci il numero corrispondente al risultato: ");
                            int tmp_input_ris = input.nextInt();
                            success = squadra.risultato(tmp_input_ris);
                            if (success) System.out.println("Risultato aggiunto correttamente");
                            else System.out.println("Il risultato inserito non esiste");
                        } while (!success);
                    }
                    else System.out.println("Devi prima creare la tua squadra!");
                    break;
                case 3:
                    if (squadra != null) {
                        System.out.println("La tua squadra ha totalizzato " + squadra.punteggio() + " punto/i");
                    }
                    else System.out.println("Devi prima creare la tua squadra!");
                    break;
                case 4:
                    if (squadra != null) {
                        if(squadra.zero_vittorie()) System.out.println("La squadra ha zero vittorie");
                        else  System.out.println("La squadra non ha zero vittorie");
                    }
                    else System.out.println("Devi prima creare la tua squadra!");
                    break;
            }

        } while(choice != 0);
    }

    private static void print_menu() {
        System.out.println();
        System.out.println("0. Esci");
        System.out.println("1. Crea la tua squadra");
        System.out.println("2. Aggiungi risultato");
        System.out.println("3. Visualizza punteggio in classifica");
        System.out.println("4. Verifica se la tua squadra ha zero vittorie");
        System.out.print("Inserisci la tua scelta: ");
    }
}
