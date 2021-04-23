import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Stop extends JButton implements ActionListener{
    private static final int HEIGHT = 100;
    private static final int WIDTH = 300;
    private Timer timer;

    public Stop(Timer timer) {
        this.setLayout(null);
        this.setSize(WIDTH, HEIGHT);
        this.setBackground(Color.gray);
        this.setText("STOP");

        this.timer = timer;

        this.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        timer.stop();
    }
}
