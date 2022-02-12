import java.util.Arrays;

public class Documento {
    private String titolo;
    private Paragrafo[] paragrafi; // AGGREGATION
    private final int maxParagrafi = 100;
    private int index = 0;

    public Documento(String titolo) {
        this.titolo = titolo;
        paragrafi = new Paragrafo[maxParagrafi];
    }

    @Override
    public String toString() {
        return "\n\t" + titolo + "\n" + Arrays.toString(paragrafi);
    }

    /**
     * @return false if operation fails (vector full)
     */
    public boolean aggiungiParagrafo(Paragrafo paragrafo) {
        if(index >= maxParagrafi) return false;
        paragrafi[index] = paragrafo;
        index++;
        return true;
    }
}
