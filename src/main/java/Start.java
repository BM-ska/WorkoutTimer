import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JButton implements ActionListener {
    private static final int HEIGHT = 100;
    private static final int WIDTH = 300;

    public Start() {
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.gray);
        this.setText("START");
        this.setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {

    }
}
