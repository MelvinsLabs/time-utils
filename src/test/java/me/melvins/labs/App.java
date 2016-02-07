/*
 * 
 */

package me.melvins.labs;

import me.melvins.labs.timer.Timer;

/**
 * @author Mels
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();
        Thread.sleep(10000);
        timer.logTimeElapsed();
    }

}
