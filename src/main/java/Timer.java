import javax.swing.*;

import static java.lang.Thread.sleep;

public class Timer extends JLabel implements Runnable{
    private int time;
    private int maxTime;
    private int minutes;
    private int seconds;
    private String timeText;

    public Timer() {
        setLayout(null);
        setLocation(200,50);
        setSize(100, 100);

        new Thread(() -> {
            try {
                start_time();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int max_time) {
        this.maxTime = max_time;
    }

    private void reset()
    {
        if (maxTime == 10)
            maxTime = 5;
        else
            maxTime = 10;

        seconds = 0;
        minutes = 0;

    }
    private void start_time () throws InterruptedException {

        while (true)
        {
            reset();

            for( int i = 0; i <= maxTime; i++)
            {
                timeText = "";

                if(minutes < 10)
                    timeText += "0";

                timeText += minutes + " : ";

                if(seconds < 10)
                    timeText += "0";

                timeText += seconds;
                setText(timeText);


                sleep(1000);

                seconds ++;

                if(seconds == 60)
                {
                    seconds = 0;
                    minutes ++;
                }
            }


        }






    }

    public void run() {

        try {
            start_time();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
