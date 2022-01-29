public class Studente {
    private String nome;
    private Diploma diploma;

    public Studente(String nome, Diploma diploma) {
        this.nome = nome;
        this.diploma = diploma;
    }

    public Diploma getDiploma() {
        return diploma;
    }

    public String getTitoloDiploma() {
        return diploma.getTitolo();
    }
}
