public class VassoioAttivo {
    int unDato;
    boolean empty = true;

    int prendi() {
        while(empty);
        System.out.println(Thread.currentThread() + " Preso: " + unDato);
        empty = true;
        return unDato;
    }
    void metti(int d) {
        while(!empty);
        unDato = d;
        System.out.println(Thread.currentThread() + " Depositato: " + d);
        empty = false;
    }
}
