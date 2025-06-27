package org.challenges.sheep;

import java.util.Objects;

public record MyWool(Ply ply, Colour colour, Short number) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyWool myWool)) return false;
        return ply.equals(myWool.ply) && colour.equals(myWool.colour) && number.equals(myWool.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ply, colour, number);
    }

    @Override
    public String toString() {
        return "Wool{" + "ply=" + ply + ", colour=" + colour + ", number=" + number+ '}';
    }
}