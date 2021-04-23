import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

    public Menu() {

        setLayout(null);
        setResizable(false);
        setSize(900, 600);
        setLocationRelativeTo(null);

        setFocusable(true);
        setTitle("Cwiczenia");

        Timer timer = new Timer(SwingConstants.CENTER);
        add(timer);

        Buttons buttons = new Buttons(timer);
        add(buttons);



    }

}
