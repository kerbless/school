public class ContoCorrenteCointestato extends ContoCorrente {
    private String cointestatario;
    ContoCorrenteCointestato(String intestatario, int codice, String cointestatario) {
        super(intestatario, codice);
        this.cointestatario = cointestatario;
    }
}
