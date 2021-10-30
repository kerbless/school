public class Elemento {

    //attributes
    private String codice;
    private String produttore;
    private String nome;
    private int nCopie;
    private int nCopieTot;

    //constructors
    public Elemento(String codice, String produttore, String nome) {
        this.codice = codice;
        this.produttore = produttore;
        this.nome = nome;
    }

    //methods
    public void setnCopie(int nCopie) {
        this.nCopie = nCopie;
    }
    public int getnCopie() {
        return nCopie;
    }
    boolean prestito() {
        if (nCopie > 0) {
            nCopie--;
            return true;
        }
        return false;
    }
    boolean restituzione() {
        if (nCopie < nCopieTot) {
            nCopie++;
            return true;
        }
        else return false;
    }
    public String getCodice() {
        return codice;
    }

    public int getnCopieTot() {
        return nCopieTot;
    }

    public void setnCopieTot(int nCopieTot) {
        this.nCopieTot = nCopieTot;
    }
}
