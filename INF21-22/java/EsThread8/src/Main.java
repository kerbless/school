public class Main {
    public static void main(String[] args) {
        Tray t = new Tray();
        new Waiter(t);
        new Chef(t);
    }
}
