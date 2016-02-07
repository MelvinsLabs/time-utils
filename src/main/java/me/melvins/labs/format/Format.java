/*
 *
 */

package me.melvins.labs.format;

/**
 * @author Mels
 */
public class Format {

    public static String formatTime(long milliseconds) {

        if (milliseconds < 1000) {
            return milliseconds + "ms";

        } else {
            long seconds = milliseconds / 1000;
            long balanceMilliseconds = milliseconds % 1000;

            if (seconds < 60) {
                return seconds + "s " + balanceMilliseconds + "ms";

            } else {
                long minutes = seconds / 60;
                long balanceSeconds = seconds % 60;

                if (minutes < 60) {
                    return minutes + "m " + balanceSeconds + "s " + balanceMilliseconds + "ms";

                } else {
                    long hours = minutes / 60;
                    long balanceMinutes = minutes % 60;

                    if (hours < 24) {
                        return hours + "h " + balanceMinutes + "m " + balanceSeconds + "s " + balanceMilliseconds +
                                "ms";

                    } else {
                        long days = hours / 24;
                        long balanceHours = hours % 24;

                        return days + "d " + balanceHours + "h " + balanceMinutes + "m " + balanceSeconds + "s " +
                                balanceMilliseconds + "ms";
                    }
                }
            }
        }
    }

}
