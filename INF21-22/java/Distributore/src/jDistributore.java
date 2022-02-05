import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jDistributore {
    private JPanel MainPanel;
    private JButton OnOffButton;
    private JLabel Status;
    private JPanel StatusPanel;
    private JPanel ControlPanel;
    private JButton inserisciGettoneButton;
    private JLabel Gettoni;
    private JButton prendiCaffèButton;
    private JLabel Ordine;
    private JButton prendiCappuccinoButton;
    private JButton restituisciCreditoButton;
    private JButton svuotaERicaricaButton;
    Distributore d = new Distributore();

    public jDistributore() {
        inserisciGettoneButton.setEnabled(false);
        prendiCaffèButton.setEnabled(false);
        prendiCappuccinoButton.setEnabled(false);
        restituisciCreditoButton.setEnabled(false);
        svuotaERicaricaButton.setEnabled(false);
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel"); //Windows Look and feel
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {}
        OnOffButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.accensioneSpegnimento();
                if(d.isAcceso()) {
                    Status.setText("Il distributore è ACCESO");
                    OnOffButton.setText("Spegni");
                    inserisciGettoneButton.setEnabled(d.isAcceso());
                    prendiCaffèButton.setEnabled(d.isAcceso());
                    prendiCappuccinoButton.setEnabled(d.isAcceso());
                    restituisciCreditoButton.setEnabled(d.isAcceso());
                    svuotaERicaricaButton.setEnabled(d.isAcceso());
                }
                else {
                    Status.setText("Il distributore è SPENTO");
                    OnOffButton.setText("Accendi");
                    inserisciGettoneButton.setEnabled(d.isAcceso());
                    prendiCaffèButton.setEnabled(d.isAcceso());
                    prendiCappuccinoButton.setEnabled(d.isAcceso());
                    restituisciCreditoButton.setEnabled(d.isAcceso());
                    svuotaERicaricaButton.setEnabled(d.isAcceso());
                }
            }
        });
        inserisciGettoneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = d.inserimentoGettone();
                if(r == 0) Gettoni.setText("Gettoni: " + d.getCredito());
                else if(r == 1) Gettoni.setText("GETTONIERA PIENA");
            }
        });
        prendiCaffèButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = d.prendiCaffe();
                if(r == 0) Ordine.setText("Caffè consegnato (" + d.getCaffe() + " rimanenti)");
                else if(r == 1) Ordine.setText("Caffè esauriti");
                else if(r == 2) Ordine.setText("Credito insufficiente");
                Gettoni.setText("Gettoni: " + d.getCredito());
            }
        });
        prendiCappuccinoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int r = d.prendiCappuccino();
                if(r == 0) Ordine.setText("Cappuccino consegnato");
                else if(r == 1) Ordine.setText("Cappuccini esauriti");
                else if(r == 2) Ordine.setText("Credito insufficiente");
                Gettoni.setText("Gettoni: " + d.getCredito());
            }
        });
        restituisciCreditoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.restituisciCredito();
                Gettoni.setText("Gettoni: " + d.getCredito());
            }
        });
        svuotaERicaricaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                d.svuotaERicarica();
                Gettoni.setText("Gettoni: " + d.getCredito());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("jDistributore");
        frame.setContentPane(new jDistributore().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
