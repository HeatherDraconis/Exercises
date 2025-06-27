package org.challenges.sheep;

import java.util.List;

public class MyJacobs extends MySheep {
    public static List<MyWool> getMyWools() {
        setSheepNumber("Jacobs");
        Jacobs jacobSheep = new Jacobs();
        return getWools(jacobSheep);
    }
}
