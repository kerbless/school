import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Opening scanner
        Scanner reader = new Scanner(System.in);

        // Rettangolo
        System.out.println("Inserisci l'altezza del rettangolo: ");
        int altezzaR = reader.nextInt();
        System.out.println("Inserisci la base del rettangolo: ");
        int baseR = reader.nextInt();

        Rettangolo r = new Rettangolo(altezzaR, baseR); // Istanza "r" della classe Rettangolo, inizializzata con il costruttore Rettangolo()
        int p = r.perimetro();
        int a = r.area();
        System.out.println("Perimetro rettangolo: " + p);
        System.out.println("Area rettangolo: " + a);

        // Trapezio isoscele
        System.out.println("Inserisci la base maggiore del trapezio isoscele: ");
        int latoMaggiore = reader.nextInt();
        System.out.println("Inserisci la base minore del trapezio isoscele: ");
        int latoMinore = reader.nextInt();
        System.out.println("Inserisci il lato del trapezio isoscele: ");
        int latoIsoscele = reader.nextInt();

        Trapezio tIsoscele = new Trapezio(latoMaggiore, latoMinore, latoIsoscele);
        System.out.println("Perimetro trapezio isoscele: " + tIsoscele.perimetro());
        System.out.println("Area trapezio isoscele: " + tIsoscele.area());

        // Trapezio scaleno
        System.out.println("Inserisci la base maggiore del trapezio scaleno: ");
        latoMaggiore = reader.nextInt();
        System.out.println("Inserisci la base minore del trapezio scaleno: ");
        latoMinore = reader.nextInt();
        System.out.println("Inserisci il lato sinistro del trapezio isoscele: ");
        int latoSinistro = reader.nextInt();
        System.out.println("Inserisci il lato destro del trapezio isoscele: ");
        int latoDestro = reader.nextInt();
        System.out.println("Inserisci l'altezza del trapezio isoscele: ");
        int altezza = reader.nextInt();

        Trapezio tScaleno = new Trapezio(latoMaggiore, latoMinore, latoSinistro, latoDestro, altezza);
        System.out.println("Perimetro trapezio scaleno: " + tScaleno.perimetro());
        System.out.println("Area trapezio scaleno: " + tScaleno.area());

        // Closing scanner
        reader.close();
    }
}