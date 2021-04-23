import static java.lang.Thread.sleep;

public class Timer implements Runnable{
    private int time;
    private int maxTime;

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

    private void start_time () throws InterruptedException {
        for( time = 0; time <= maxTime; time++)
        {
            sleep(1000);
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
