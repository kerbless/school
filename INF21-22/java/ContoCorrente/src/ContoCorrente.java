public class ContoCorrente {
    private String intestatario;
    private int codice;
    private float saldo;

    ContoCorrente(String intestatario, int codice) {
        this.intestatario = intestatario;
        this.codice = codice;
        saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public void prelievo(float ammontare) {
        saldo -= ammontare;
    }

    public void versamento(float ammontare) {
        saldo += ammontare;
    }
}
