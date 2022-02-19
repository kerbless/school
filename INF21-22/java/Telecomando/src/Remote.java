import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Remote {
    private JPanel remote;
    private JPanel controls;
    private JPanel status;
    private JLabel powerState;
    private JButton onOff;
    private JButton volRaise;
    private JButton chBackward;
    private JButton chForward;
    private JButton volLower;
    private JLabel channel;
    private JLabel volume;
    private TV tv = new TV();

    public Remote() {

        onOff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(tv.isOn()) {
                    tv.off();
                    powerState.setText("OFF");
                }
                else {
                    tv.on();
                    powerState.setText("ON");
                }
            }
        });
        chForward.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tv.isOn()) return;
                tv.chForward();
                channel.setText(Integer.toString(tv.getCh()));
            }
        });
        chBackward.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tv.isOn()) return;
                tv.chBackward();
                channel.setText(Integer.toString(tv.getCh()));
            }
        });
        volRaise.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tv.isOn()) return;
                tv.volRaise();
                volume.setText(Integer.toString(tv.getVol()));
            }
        });
        volLower.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!tv.isOn()) return;
                tv.volLower();
                volume.setText(Integer.toString(tv.getVol()));
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Remote");
        frame.setContentPane(new Remote().remote);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
