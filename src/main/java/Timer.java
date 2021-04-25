import javax.swing.*;
import java.awt.*;

public class Timer extends JLabel{
    private int time;
    private int maxTime;
    private int minutes;
    private int seconds;
    private final javax.swing.Timer stopwatch;
    String timeText;


    public Timer(int aligment) {
        super("", aligment);
        setLayout(null);
        setBounds(0,WindowSize.HSIZE.getSize()/5, WindowSize.VSIZE.getSize(), WindowSize.HSIZE.getSize()/5);

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

    private void viewTime()
    {
        timeText = "";

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

    private void reset()
    {
        if (maxTime == 3)
        {
            maxTime = 5;
        }

        else
        {
            maxTime = 3;
        }

        seconds = 0;
        minutes = 0;
        time = 0;

    }
}
