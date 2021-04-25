import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

    public Menu() {

        setLayout(null);
        setResizable(false);
        setSize(WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize());


        setLocationRelativeTo(null);

        setFocusable(true);
        setTitle("Cwiczenia");

        State state = new State(SwingConstants.CENTER);
        add(state);

        Timer timer = new Timer(SwingConstants.CENTER);
        add(timer);

        Buttons buttons = new Buttons(timer);
        add(buttons);



    }

}
