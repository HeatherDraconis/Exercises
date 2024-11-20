package org.codewars.kata;

import java.util.stream.IntStream;

public class GrazingDonkey {
    public static int getRopeLength(int fieldDiameter, double eatenRatio) {
        int ropeLength = (int) (fieldDiameter * eatenRatio);
        double ratio = getRatio(fieldDiameter, ropeLength);
        if (fieldDiameter == 0 || eatenRatio == ratio) {
            return ropeLength;
        }
        String fieldString = String.valueOf(fieldDiameter);
        ropeLength = (int) (fieldDiameter/Math.pow(10, fieldString.length() - 1) * eatenRatio) / 10;
        for (int i = 0; i < fieldString.length(); i++) {
             ropeLength = getLength((int) (fieldDiameter/Math.pow(10, fieldString.length() - i - 1)), eatenRatio, ropeLength * 10);
        }
        return ropeLength;
    }

    public static int getLength(int fieldDiameter, double eatenRatio, int ropeLength) {
        double ratio = getRatio(fieldDiameter, ropeLength);
        if (fieldDiameter == 0 || eatenRatio == ratio) {
            return ropeLength;
        }
        if (eatenRatio > ratio) {
            while (eatenRatio > ratio) {
                ratio = getRatio(fieldDiameter, ++ropeLength);
            }
            return --ropeLength;
        } else {
            while (eatenRatio <= ratio) {
                ratio = getRatio(fieldDiameter, --ropeLength);
            }
            return ropeLength;
        }
    }

    private static double getRatio(double fieldDiameter, int ropeLength) {
        double angle = Math.acos(Math.pow(ropeLength, 2) / (2 * Math.pow(fieldDiameter / 2, 2)) - 1);
        return 1 + (angle * Math.cos(angle)- Math.sin(angle)) / Math.PI;
    }

    public static int getRopeLength2(int fieldDiameter, double eatenRatio) {
        return IntStream.iterate(fieldDiameter, i -> i >= 0, i -> i - 1)
                .filter(i -> getRatio(fieldDiameter, i) <= eatenRatio)
                .findFirst()
                .orElse((int) (fieldDiameter * eatenRatio));
    }

    public static int getRopeLength3(int fieldDiameter, double eatenRatio) {
        int ropeLength = (int) (fieldDiameter * eatenRatio);
        double ratio = getRatio(fieldDiameter, ropeLength);
        if (fieldDiameter == 0 || eatenRatio == ratio) {
            return ropeLength;
        }
        if (eatenRatio > ratio) {
            while (eatenRatio > ratio) {
                ratio = getRatio(fieldDiameter, ++ropeLength);
            }
            return --ropeLength;
        } else {
            while (eatenRatio <= ratio) {
                ratio = getRatio(fieldDiameter, --ropeLength);
            }
            return ropeLength;
        }
    }
}