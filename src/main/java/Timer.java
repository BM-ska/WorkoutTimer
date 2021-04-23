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
        setBounds(0,0, 900, 150);

        reset();

        stopwatch = new javax.swing.Timer(1000, e -> {

            timeText = "";

            if(minutes < 10)
                timeText += "0";

            timeText += minutes + " : ";

            if(seconds < 10)
                timeText += "0";

            timeText += seconds;

            Font font = new Font("SansSerif", Font.BOLD, 70);
            setText(timeText);
            setFont(font);


            seconds ++;
            if(seconds == 60)
            {
                seconds = 0;
                minutes ++;
            }

            time ++;

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

    private void reset()
    {
        if (maxTime == 3)
            maxTime = 5;
        else
            maxTime = 3;

        seconds = 0;
        minutes = 0;
        time = 0;

    }
}
