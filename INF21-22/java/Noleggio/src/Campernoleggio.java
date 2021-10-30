public class Campernoleggio extends Autonoleggio {
    public Campernoleggio(String noleggiatore, int giorni) {
        super(noleggiatore, giorni);
    }

    public int costo() {
        return getGiorni()*65+200;
    }
}
