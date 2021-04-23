import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stop extends JButton implements ActionListener {
    private static final int HEIGHT = 100;
    private static final int WIDTH = 300;

    public Stop() {
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.gray);
        this.setText("STOP");
        this.setLayout(null);

    }

    public void actionPerformed(ActionEvent e) {

    }
}
