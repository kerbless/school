public class Parallelepipedo extends Rettangolo {
    private int altezza;

    Parallelepipedo(int larghezza, int lunghezza, int altezza) {
        super(larghezza, lunghezza);
        this.altezza = altezza;
    }

    @Override
    int area() {
        return 2*(super.area() + getLarghezza()*altezza + getLunghezza()*altezza);
    }

    int volume() {
        return super.area()*altezza;
    }
}
