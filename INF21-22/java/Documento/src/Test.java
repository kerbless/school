public class Test {
    public static void main(String[] args) {
        Documento doc = new Documento("Titolo di prova");
        Paragrafo par = new Paragrafo();
        Frase f = new Frase("Frase");

        boolean result = true;
        while(result) {
            result = doc.aggiungiParagrafo(par);
        }

        result = true;
        while(result) {
            result = par.aggiungiFrase(f);
        }

        System.out.println(doc);
    }
}
