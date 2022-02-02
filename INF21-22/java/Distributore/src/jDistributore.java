import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jDistributore {
    private JPanel MainPanel;
    private JButton OnOffButton;
    private JLabel Status;
    private JPanel StatusPanel;
    private JPanel ControlPanel;
    Distributore d = new Distributore();

    public jDistributore() {
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
                }
                else {
                    Status.setText("Il distributore è SPENTO");
                    OnOffButton.setText("Accendi");
                }
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
