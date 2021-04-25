import javax.swing.*;
import java.awt.*;

public class Buttons extends JPanel{

    public Buttons(Timer timer) {
        setBounds(0,4 * WindowSize.HSIZE.getSize()/5, WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize()/5);
        setBorder(null);
        setLayout(null);

        Start start = new Start(timer);
        Stop stop = new Stop(timer);

        add(start);
        add(stop);
    }
}
