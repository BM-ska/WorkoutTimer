import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    public Menu() {

        setResizable(false);
        setSize(900, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setFocusable(true);
        setTitle("Cwiczenia");

        Timer time = new Timer();
        add(time);

        Buttons buttons = new Buttons();
        add(buttons);


    }



}
