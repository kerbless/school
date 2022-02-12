import java.util.Arrays;

public class Paragrafo {
    private Frase[] frasi; // AGGREGATION

    @Override
    public String toString() {
        return "\n" + Arrays.toString(frasi) + "\n";
    }

    private final int maxFrasi = 100;
    private int index = 0;

    public Paragrafo() {
        frasi = new Frase[maxFrasi];
    }

    /**
     *
     * @param frase
     * @return false if operation fails (vector full)
     */
    public boolean aggiungiFrase(Frase frase) {
        if(index >= maxFrasi) return false;
        frasi[index] = frase;
        index++;
        return true;
    }
}
