package org.codewars.kata;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        int hours = minutes / 60;
        minutes -= hours * 60;

        String hoursStr = toTwoDigits(Integer.toString(hours));
        String minutesStr = toTwoDigits(Integer.toString(minutes));
        String secondsStr = toTwoDigits(Integer.toString(seconds));

        return hoursStr + ":" + minutesStr + ":" + secondsStr;
    }

    private static String toTwoDigits(String string) {
        if (string.length() == 1) {
            string = "0" + string;
        }
        return string;
    }
}
