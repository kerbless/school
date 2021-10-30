public class Rettangolo { // Classe
    private int altezza; // Attributi (o parametri)
    private int base;
    public Rettangolo(int altezza, int base) { // Costruttore
        this.altezza = altezza; // "this" = questo (oggetto)
        this.base = base;
    }
    public int perimetro() {
        return ((base + altezza) * 2); // "this" non è necessario anche se si può mettere
    }
    public int area() {
        return base*altezza;
    }
}
