public class Rettangolo {
    private int larghezza;
    private int lunghezza;

    Rettangolo(int larghezza, int lunghezza) {
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
    }

    int area() {
        return larghezza * lunghezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getLunghezza() {
        return lunghezza;
    }
}
