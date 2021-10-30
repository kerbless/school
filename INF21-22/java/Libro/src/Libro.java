public class Libro extends Elemento {
    private String autore;
    private int nPagine;

    //constructors
    public Libro(String codice, String casaEditrice, String titolo, String autore, int nPagine) {
        super(codice, casaEditrice, titolo);
        this.autore = autore;
        this.nPagine = nPagine;
    }

    public int getnPagine() {
        return nPagine;
    }
}