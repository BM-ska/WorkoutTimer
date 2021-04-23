import javax.swing.*;
import javax.swing.text.JTextComponent;

public class Time extends JLabel {

    public Time() {




        Timer timer = new Timer();
        setText(String.valueOf(timer.getTime()));
    }
}
