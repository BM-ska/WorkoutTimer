import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
}
