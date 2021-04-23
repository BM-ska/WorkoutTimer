import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Time extends JLabel {

    public Time() {

        setLocation(200,50);
        setSize(100, 100);
        setLayout(null);


        Timer timer = new Timer();
        setText(String.valueOf(timer.getTime()));
    }
}
