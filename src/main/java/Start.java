import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JButton implements ActionListener{
    private static final int HEIGHT = WindowSize.HSIZE.getSize()/10;
    private static final int WIDTH = WindowSize.VSIZE.getSize()/3;
    private Timer timer;

    public Start(Timer timer) {

       // super();
        this.setLayout(null);
        this.setBounds( WindowSize.VSIZE.getSize()/12, 10, WIDTH, HEIGHT);

        this.setBackground(Color.gray);
        this.setText("START");


        this.timer = timer;

        this.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        timer.start();
    }
}
