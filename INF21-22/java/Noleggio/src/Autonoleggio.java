public class Autonoleggio {
    private String noleggiatore;
    private int giorni;

    public Autonoleggio(String noleggiatore, int giorni) {
        this.noleggiatore = noleggiatore;
        this.giorni = giorni;
    }

    public int costo() {
        return giorni*85;
    }

    public int getGiorni() {
        return giorni;
    }
}
