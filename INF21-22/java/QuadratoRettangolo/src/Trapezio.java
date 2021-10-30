import java.lang.Math.*;

public class Trapezio {
    private int latoMaggiore;
    private int latoMinore;
    private int latoSinistro;
    private int latoDestro;
    private double altezza;
    Trapezio(int latoMaggiore, int latoMinore, int latoSinistro, int latoDestro, double altezza) { // scaleno
        this.latoMaggiore = latoMaggiore;
        this.latoMinore = latoMinore;
        this.latoSinistro = latoSinistro;
        this.latoDestro = latoDestro;
        this.altezza = altezza;
    }
    Trapezio(int latoMaggiore, int latoMinore, int latoIsoscele) { // isoscele - overloading (Polymorphism)
        this.latoMaggiore = latoMaggiore;
        this.latoMinore = latoMinore;
        this.latoSinistro = latoIsoscele;
        this.latoDestro = latoIsoscele;
        this.altezza = Math.sqrt(Math.pow(latoIsoscele, 2) - Math.pow((latoMaggiore - latoMinore) / 2, 2));
    }
    double area() {
        return (latoMaggiore+latoMinore)*altezza/2;
    }
    int perimetro() {
        return latoMinore+latoMaggiore+latoSinistro+latoDestro;
    }
}
