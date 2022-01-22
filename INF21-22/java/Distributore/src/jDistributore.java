import javax.swing.*;

public class jDistributore extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;

    public jDistributore() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }

    public static void main(String[] args) {
        jDistributore dialog = new jDistributore();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
