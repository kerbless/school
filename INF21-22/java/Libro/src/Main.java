
public class Main {
    public static void main(String[] args) {
        // create objects
        Libro libro1 = new Libro("LB001", "Mondadori", "Eragon", "Cristopher Paolini", 503);
        libro1.setnCopie(10);
        Libro libro2 = new Libro("LB002", "Adelphi", "L'uomo che scambiò sua moglie per un cappello", "Oliver Sacks", 287);
        libro2.setnCopie(1);
        DVD dvd1 = new DVD("DV001", "Columbia pictures", "Spiderman 1", "2h 1m", "action/fantasy");
        dvd1.setnCopie(1);
    }
}
