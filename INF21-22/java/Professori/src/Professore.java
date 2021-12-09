public class Professore {
    private String cognome;
    private String nome;
    private String materia;

    Professore(String cognome, String nome) {
        this.cognome = cognome;
        this.nome = nome;
    }

    void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Prof. " + cognome + " " + nome + " insegna " + materia;
    }
}
