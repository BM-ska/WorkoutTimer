import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Images extends JPanel implements Observable{
    private final List<Icon> images = new ArrayList<>();
    JLabel image;
    private static final int HEIGHT = 2* WindowSize.HSIZE.getSize()/5;
    private static final int WIDTH = 2* WindowSize.VSIZE.getSize()/3;

    public Images() {
        setLayout(null);
        setBounds(0,2 * WindowSize.HSIZE.getSize()/5, WindowSize.VSIZE.getSize(), HEIGHT);

        image = new JLabel();
        image.setLayout(null);
        image.setBounds( (WindowSize.VSIZE.getSize() - WIDTH )/2 ,0, WIDTH, HEIGHT);

        add(image);

        loadImages();
        viewImages();

    }

    private void viewImages()
    {
        image.setIcon(images.get(0));
    }

    private void loadImages()
    {
        for (int i = 1; i <= 1; i++){
            Icon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource("/"+ i +".jpg")));
            images.add(icon);
        }
    }

    @Override
    public void Change(String state) {

    }
}
