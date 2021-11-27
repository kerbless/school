public class PennaCancellabile extends Penna {
    private int gomma;

    public PennaCancellabile(String marca, String colore, int inchiostro, int gomma) {
        super(marca, colore, inchiostro);
        this.gomma = gomma;
    }

    public int gommaRimanente() { // getter
        return gomma;
    }

    public boolean gommaPresente() {
        return gomma > 0;
    }

    public boolean cancella(int qt) { // similar to a setter
        if (qt <= gomma) {
            gomma -= qt;
            return true;
        }
        else return false;
    }
}
