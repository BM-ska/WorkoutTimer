import javax.swing.*;

public class Menu extends JFrame {
    public static final int SETS;
    static {
        SETS = 1;
    }

    public Menu() {

        setLayout(null);
        setResizable(false);
        setSize(WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize());


        setLocationRelativeTo(null);

        setFocusable(true);
        setTitle("Cwiczenia");

        State state = new State(SwingConstants.CENTER);
        add(state);

        Images images = new Images();
        add(images);

        Timer timer = new Timer(SwingConstants.CENTER, state, images);
        add(timer);

        Buttons buttons = new Buttons(timer);
        add(buttons);



    }

}
