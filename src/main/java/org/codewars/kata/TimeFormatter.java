package org.codewars.kata;

import java.util.ArrayList;
import java.util.Collections;

public class TimeFormatter {
    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        int minutes = seconds / 60;
        seconds -= minutes * 60;
        int hours = minutes / 60;
        minutes -= hours * 60;
        int days = hours / 24;
        hours -= days * 24;
        int years = days / 365;
        days -= years * 365;

        ArrayList<String> timeList = new ArrayList<>();
        buildTime(timeList, years, "year");
        buildTime(timeList, days, "day");
        buildTime(timeList, hours, "hour");
        buildTime(timeList, minutes, "minute");
        buildTime(timeList, seconds, "second");

        StringBuilder stringBuilder = new StringBuilder();
        if (!timeList.isEmpty()) {
            stringBuilder.append(timeList.getFirst());
        }
        for (int i = 1; i < timeList.size() - 1; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(timeList.get(i));
        }
        if (timeList.size() > 1) {
            stringBuilder.append(" and ");
            stringBuilder.append(timeList.getLast());
        }

        return stringBuilder.toString();
    }

    private static void buildTime(ArrayList<String> timeList, int time, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        if (time >= 1) {
            stringBuilder.append(time).append(" ").append(str);
            if (time > 1) {
                stringBuilder.append("s");
            }
            timeList.add(stringBuilder.toString());
        }
    }
}
