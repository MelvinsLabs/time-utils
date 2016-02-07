/*
 *
 */

package me.melvins.labs.timer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.MessageFormatMessageFactory;

import static me.melvins.labs.format.Format.formatTime;

/**
 * @author Mels
 */
public class Timer {

    private static final Logger LOGGER = LogManager.getLogger(Timer.class, new MessageFormatMessageFactory());

    private long start;

    private long stop;

    public Timer() {
        this.start = System.currentTimeMillis();
    }

    public long timeElapsedAsOfNow() {
        long lap = System.currentTimeMillis();
        return lap - start;
    }

    public void logTimeElapsedAsOfNow() {
        LOGGER.info("Time Elapsed = {0}", formatTime(timeElapsedAsOfNow()));
    }

    public long timeElapsed() {
        stop = System.currentTimeMillis();
        return stop - start;
    }

    public void logTimeElapsed() {
        LOGGER.info("Time Elapsed = {0}", formatTime(timeElapsed()));
    }

}
