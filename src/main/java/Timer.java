import javax.swing.*;
import java.awt.*;

public class Timer extends JLabel{
    private int time;
    private int maxTime;
    private int minutes;
    private int seconds;
    private final javax.swing.Timer stopwatch;
    private String stateName;
    private int set;

    private final Observable state;
    private final ObservableImages images;

    public Timer(int aligment, Observable state, ObservableImages images) {
        super("", aligment);
        setLayout(null);
        setBounds(0,WindowSize.HSIZE.getSize()/5, WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize()/5);

        this.state = state;
        this.images = images;

        reset();
        stopwatch = new javax.swing.Timer(1000, e -> {
            viewTime();

            if(stateName.equals("break") && time + 1 == maxTime)
                changeImage();

            if(time == maxTime + 1)
                reset();

            if(set == 2 * Menu.SETS + 1)
            {
                stop();
                //finish
            }


        });
    }

    void start(){
        stopwatch.start();
    }

    void stop(){
        stopwatch.stop();
    }

    void changeState() {
        state.Change(stateName);
    }

    void changeImage() {
        images.Change(set / 2);
    }

    private void viewTime() {
        changeState();

        String timeText = "";

        if(minutes < 10)
            timeText += "0";

        timeText += minutes + " : ";

        if(seconds < 10)
            timeText += "0";

        timeText += seconds;

        Font font = new Font("SansSerif", Font.BOLD, WindowSize.HSIZE.getSize()/10);
        setText(timeText);
        setFont(font);

        seconds ++;
        if(seconds == 60)
        {
            seconds = 0;
            minutes ++;
        }
        time ++;
    }

    private void reset() {
        set ++;
        if (maxTime == 2)
        {
            stateName = "work";
            maxTime = 3;
        }

        else
        {
            stateName = "break";
            maxTime = 2;
        }

        seconds = 0;
        minutes = 0;
        time = 0;
    }
}
