package org.codewars.kata;

public class AffordableVacation {
    public static String findMinCost(int money, int days, int[] cost) {
        int moneySpent = 0;
        int moneyNew = money + 1;
        int daysSpent = 0;
        int daysNew = 0;
        int j = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i != 0) {
                if (moneySpent <= money) daysSpent = daysSpent - 1;
                moneySpent = moneySpent - cost[i - 1];
            }
            while (moneySpent < money && daysSpent < days && j < cost.length) {
                moneySpent += cost[j];
                daysSpent++;
                j++;
            }
            if (moneySpent > money) daysSpent--;
            if (daysSpent == days && moneySpent < moneyNew) moneyNew = moneySpent;
            if (daysSpent > daysNew) daysNew = daysSpent;
        }
        return daysNew == days ? "money: " + moneyNew : "days: " + daysNew;
    }
}
