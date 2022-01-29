public class Diploma {
    private int voto;
    private String data;
    private String scuola;
    private Studente studente;
    private String titolo;

    public Diploma(int voto, String data, String scuola) {
        this.voto = voto;
        this.data = data;
        this.scuola = scuola;
    }

    public String getTitolo() {
        return titolo;
    }
}
