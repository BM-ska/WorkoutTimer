import javax.swing.*;
import java.awt.GridLayout;

public class Buttons extends JPanel{

    public Buttons(Timer timer) {
        setSize(800, 100);

        Start start = new Start(timer);
        Stop stop = new Stop(timer);
        add(start);
        add(stop);


        setLocation(50,400);
        setLayout(new GridLayout(1, 0, 2, 200));


    }
}
