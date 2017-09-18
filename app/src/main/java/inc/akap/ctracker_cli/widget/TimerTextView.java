package inc.akap.ctracker_cli.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Steve Ruben on 18/09/2017.
 */

public class TimerTextView extends TextView implements Runnable {

    private long mSecond;
    private boolean isRun = false;// Whether to start the state

    public TimerTextView(Context context) {
        super(context);
    }

    public TimerTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimerTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * Initialize countdown time
     *
     * @param times
     */
    public void setTimes(long times) {
        mSecond = times;
    }

    /**
     * Countdown calculation
     */
    private void computeTime() {

        mSecond--;

    }

    /**
     * Determine whether the countdown
     *
     * @return
     */
    public boolean isRun() {
        return isRun;
    }

    /**
     * Start counting.
     */
    public void beginRun() {
        this.isRun = true;
        run();
    }

    /**
     * Pause Countdown
     */
    public void stopRun() {
        this.isRun = false;
    }

    @Override
    public void run() {
        if (isRun) {
            computeTime();
            if (mSecond == 0) {
                setText("Skipped");
                stopRun();
                return;
            }
            String strTime = mSecond + "Secondes";
            setText(strTime);
            postDelayed(this, 1000);
        } else {
            removeCallbacks(this);
        }
    }
}

