public class Test {
    public static void main(String[] args) {
        // expected results in comments
        Penna bic = new Penna("bic", "nero", 100);
        System.out.println("inchiostro: " + bic.inchiostroRimanente()); // 100
        System.out.println("funzionante: " + bic.funzionante()); // true
        System.out.println("scrivi 60: " + bic.scrivi(60)); // true
        System.out.println("inchiostro: " + bic.inchiostroRimanente()); // 40
        System.out.println("funzionante: " + bic.funzionante()); // true
        System.out.println("scrivi rimanente: " + bic.scrivi(bic.inchiostroRimanente())); // true
        System.out.println("inchiostro: " + bic.inchiostroRimanente()); // 0
        System.out.println("funzionante: " + bic.funzionante()); // false
        System.out.println("_______________________");
        PennaCancellabile techpoint = new PennaCancellabile("pilot", "blu", 50, 5);
        System.out.println("gomma: " + techpoint.gommaRimanente()); // 10
        System.out.println("gommaPresente: " + techpoint.gommaPresente()); // true
        System.out.println("cancella rimanente: " + techpoint.cancella(techpoint.gommaRimanente())); // true
        System.out.println("gomma: " + techpoint.gommaRimanente()); // 0
        System.out.println("gommaPresente: " + techpoint.gommaPresente()); // false
    }
}
