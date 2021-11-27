public class Penna {
    private String marca;
    private String colore;
    private int inchiostro;

    public Penna(String marca, String colore, int inchiostro) {
        this.marca = marca;
        this.colore = colore;
        this.inchiostro = inchiostro;
    }

    public int inchiostroRimanente() { // getter
        return inchiostro;
    }

    public boolean funzionante() {
        return inchiostro > 0;
    }

    public boolean scrivi(int inchiostro) { // similar to a setter
        if (inchiostro <= this.inchiostro) {
            this.inchiostro -= inchiostro;
            return true;
        }
        else return false;
    }
}
