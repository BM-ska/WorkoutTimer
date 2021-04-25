import javax.swing.*;
import java.awt.*;

public class State extends JLabel {
    private String state = "";

    public State (int aligment) {
        super("", aligment);
        setLayout(null);
        setBounds(0,0, WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize()/5);

        Font font = new Font("SansSerif", Font.BOLD, WindowSize.HSIZE.getSize()/10);
        setText(state);
        setFont(font);
    }

    public void setState(String state) {
        this.state = state;
    }
}
