import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N_PROF = 6;
        Scanner input = new Scanner(System.in);
        Professore[] professori = new Professore[N_PROF];
        String nome, cognome, materia;
        for (int i = 0; i < N_PROF; i++) {
            System.out.println("Inserisci i dati del prof n^" + (i+1));
            System.out.print("Nome: ");
            nome = input.nextLine();
            System.out.print("Cognome: ");
            cognome = input.nextLine();
            professori[i] = new Professore(nome, cognome);
            if (i < 3) professori[i].setMateria("Italiano"); // PRIMI TRE
            else if (i == N_PROF-1) professori[i].setMateria("Religione"); // ULTIMO
            else {
                if (i % 2 == 0) professori[i].setMateria("Informatica");// ALTRI PARI
                else professori[i].setMateria("Telecomunicazioni");  // ALTRI DISPARI
            }
        }
        System.out.println("Hai creato i professori in questo modo: ");
        for (int i = 0; i < N_PROF; i++) {
            System.out.println("N^" + (i+1) + " -> " + professori[i]);
        }
    }
}
