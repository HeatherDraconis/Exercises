package org.codewars.kata;

import java.util.StringJoiner;

public class Spider {
    public static String spiderToFly(final String spider, final String fly) {
        int startRing = Character.getNumericValue(spider.charAt(1));
        int endRing = Character.getNumericValue(fly.charAt(1));
        int startRadial = Character.getNumericValue(spider.charAt(0)) - 10;
        int endRadial = Character.getNumericValue(fly.charAt(0)) - 10;

        int ring = startRing;
        int radial = startRadial;

        StringJoiner stringJoiner1 = new StringJoiner("-").add(spider);
        double route1 = 0;
        while (ring > 1) {
            ring--;
            stringJoiner1.add(String.valueOf(Character.forDigit(radial + 10, 20)).toUpperCase() + ring);
            route1++;
        }
        if (ring > 0) {
            ring--;
            stringJoiner1.add("A0");
            route1++;
        }
        radial = endRadial;
        while (ring < endRing) {
            ring++;
            stringJoiner1.add(String.valueOf(Character.forDigit(radial + 10, 20)).toUpperCase() + ring);
            route1++;
        }
        if (startRing == 0 || endRing == 0) {
            return stringJoiner1.toString();
        }

        ring = startRing;
        radial = startRadial;

        StringJoiner stringJoiner2 = new StringJoiner("-").add(spider);
        double route2 = 0;
        while (ring > endRing) {
            ring--;
            stringJoiner2.add(String.valueOf(Character.forDigit(radial + 10, 20)).toUpperCase() + ring);
            route2++;
        }
        while ((radial > endRadial - 4 && radial < endRadial) || (radial > endRadial + 4)) {
            radial = radial == 7 ? 0 : radial + 1;
            stringJoiner2.add(String.valueOf(Character.forDigit(radial + 10, 20)).toUpperCase() + ring);
            route2 += getDistance(ring);
        }
        while (radial != endRadial) {
            radial = radial == 0 ? 7 : radial - 1;
            stringJoiner2.add(String.valueOf(Character.forDigit(radial + 10, 20)).toUpperCase() + ring);
            route2 += getDistance(ring);
        }
        while (ring != endRing) {
            ring++;
            stringJoiner2.add(String.valueOf(Character.forDigit(radial + 10, 20)).toUpperCase() + ring);
            route2++;
        }
        return route1 < route2 ? stringJoiner1.toString() : stringJoiner2.toString();
    }

    private static double getDistance(int i) {
        return Math.sqrt(2 * Math.pow(i, 2) * (1 - Math.cos(Math.PI / 4)));
    }
}
