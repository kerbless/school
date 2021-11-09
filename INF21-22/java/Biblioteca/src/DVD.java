public class DVD extends Elemento {
    private String durata;
    private String genere;

    //constructors
    public DVD(String codice, String produttore, String titolo, String durata, String genere) {
        super(codice, produttore, titolo);
        this.durata = durata;
        this.genere = genere;
    }
}
