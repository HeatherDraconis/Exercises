package org.challenges.sheep;

import java.util.List;

public interface Sheep {
    public List<Ply> getPlys();
    public List<Colour> getColours(Ply ply);
}

