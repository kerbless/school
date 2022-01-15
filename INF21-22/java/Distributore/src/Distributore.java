public class Distributore {
    private boolean acceso;
    private int caffe;
    private int cappuccini;
    private int gettoni;
    private int credito;

    public Distributore() {
        acceso = false;
        caffe = 10;
        cappuccini = 10;
        gettoni = 0;
        credito = 0;
    }

    public void stato() {
        if (acceso) System.out.println("[i] Distributore acceso con: credito = " + credito + ", caffe' = " + caffe + ", cappuccini = " + cappuccini + ", gettoniera = " + gettoni + ".");
        else System.out.println("[i] Distributore spento");
    }
    public void accendi() {
        acceso = true;
    }
    public void inserisci() {
        if (!acceso) System.out.println("[!] Il distributore è spento");
        else if (gettoni + credito > 12) System.out.println("[!] Scatola gettoni piena, usa il tasto restituzione se vuoi recuperare l'ultimo gettone inserito");
        else credito++;
    }
    public void prendi_caffe() {
        if (!acceso) System.out.println("[!] Il distributore è spento");
        else if (credito < 1) System.out.println("[!] Credito insufficiente");
        else {
            gettoni++;
            caffe--;
            credito--;
        }
    }
    public void prendi_cappuccino() {
        if (!acceso) System.out.println("[!] Il distributore è spento");
        else if (credito < 2) System.out.println("[!] Credito insufficiente");
        else {
            gettoni += 2;
            cappuccini--;
            credito -= 2;
        }
    }
    public void restituisci() {
        if (!acceso) System.out.println("[!] Il distributore è spento");
        else if (credito == 1 && gettoni == 12) credito--;
        else System.out.println("Puoi chiedere una restituzione solo nel caso in cui non sia possibile prendere un cappuccino");
    }
    public void svuota_gettoniera() {
        gettoni = 0;
    }
    public void ricarica() {
        caffe = 10;
        cappuccini = 10;
    }

}
