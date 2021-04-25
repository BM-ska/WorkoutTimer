import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Timer extends JLabel{
    private int time;
    private int maxTime;
    private int minutes;
    private int seconds;
    private final javax.swing.Timer stopwatch;
    private String timeText;
    private String stateName;

    private Observable state;
    private Observable images;

    public Timer(int aligment, Observable state, Observable images) {
        super("", aligment);
        setLayout(null);
        setBounds(0,WindowSize.HSIZE.getSize()/5, WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize()/5);

        this.state = state;
        this.images = images;

        reset();
        stopwatch = new javax.swing.Timer(1000, e -> {

            viewTime();

            if(time == maxTime + 1)
                reset();
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

        if(stateName.equals("break"))
        {
            images.Change(stateName);
        }
    }

    private void viewTime() {
        timeText = "";

        changeState();

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
        if (maxTime == 3)
        {
            stateName = "work";
            maxTime = 5;
        }

        else
        {
            stateName = "break";
            maxTime = 3;
        }

        seconds = 0;
        minutes = 0;
        time = 0;
    }
}
