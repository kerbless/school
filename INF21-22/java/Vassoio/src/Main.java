public class Main {
    public static void main(String[] args) {
        Vassoio ilVassoio = new Vassoio();
        new Produttore(ilVassoio);
        new Consumatore(ilVassoio);
    }
}