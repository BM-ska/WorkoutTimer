import javax.swing.*;
import java.awt.GridLayout;

public class Buttons extends JPanel{

    public Buttons() {
        setSize(800, 100);

        Start start = new Start();
        Stop stop = new Stop();
        add(start);
        add(stop);


        setLocation(50,400);
        setLayout(new GridLayout(1, 0, 2, 200));


    }
}
