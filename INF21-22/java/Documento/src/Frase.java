public class Frase {
    private String testo;

    @Override
    public String toString() {
        return testo;
    }

    public Frase(String testo) {
        this.testo = testo;
    }
}
