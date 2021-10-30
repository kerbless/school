public class Atleta {
    private String nome;
    private String squadra;
    private boolean visitaMedica;

    Atleta(String nome) {
        this.nome = nome;
    }

    public void setSquadra(String squadra) {
        this.squadra = squadra;
    }

    public void effettuaVisita() {
        visitaMedica = true;
    }

    public String getNome() {
        return nome;
    }

    public String getSquadra() {
        return squadra;
    }

    public boolean isVisitaMedica() {
        return visitaMedica;
    }
    
}
