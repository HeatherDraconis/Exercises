package org.challenges.sheep;

import java.util.Objects;

public record Wool(Ply ply, Integer needleSize) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Wool wool)) return false;
        return ply.equals(wool.ply) && needleSize.equals(wool.needleSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ply, needleSize);
    }

    @Override
    public String toString() {
        return "Wool{" + "ply=" + ply + ", needleSize=" + needleSize + '}';
    }

    public boolean isValid(){
        boolean valid = false;
        try {
            valid = ply.equals(getPly(needleSize));
        }
        catch (IllegalStateException e) {
            System.out.println("Unexpected Needle Size");
        }
        finally {
            System.out.println(this);
        }
        return valid;
    }

    private static Ply getPly(int needleSize) throws IllegalStateException {
        return switch (needleSize) {
            case 1, 2, 3 -> {
                System.out.println("Small Wool!");
                yield Ply.Lace;
            }
            case 4 -> Ply.DK;
            case 5 -> Ply.Aran;
            case 6, 7, 8 -> Ply.Chunky;
            case 9, 10, 11, 12 -> {
                System.out.println("Big Wool!");
                yield Ply.SuperChunky;
            }
            default -> throw new IllegalStateException("Unexpected value: " + needleSize);
        };
    }
}
