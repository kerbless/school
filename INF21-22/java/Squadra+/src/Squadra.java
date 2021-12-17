public class Squadra {
    private String nome;
    private String citta;
    private int partite_giocate;
    private int partite_vinte;
    private int partite_perse;
    private int partite_pareggiate;

    public Squadra(String nome, String citta) {
        this.nome = nome;
        this.citta = citta;
        partite_giocate = 0;
        partite_pareggiate = 0;
        partite_perse = 0;
        partite_vinte = 0;
    }

    public boolean risultato(int risultato) {
        partite_giocate++;
        switch(risultato) {
            case 0:
                partite_perse++;
                return true;
            case 1:
                partite_pareggiate++;
                return true;
            case 3:
                partite_vinte++;
                return true;
            default:
                return false;
        }
    }

    public int punteggio() {
        return partite_vinte*3 + partite_pareggiate;
    }

    public boolean zero_vittorie() {
        if (partite_vinte == 0) return true;
        else return false;
    }

}
