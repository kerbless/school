public class Vassoio {
    int unDato;

    synchronized int prendi() {
        System.out.println(Thread.currentThread() + " Preso: " + unDato);
        return unDato;
    }
    synchronized void metti(int d) {
        unDato = d;
        System.out.println(Thread.currentThread() + " Depositato: " + d);
    }
}
