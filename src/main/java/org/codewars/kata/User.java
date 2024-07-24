package org.codewars.kata;

public class User {
    public int rank = -8;
    public int progress;

    public void incProgress(int ActivityRank) {
        if ((ActivityRank > 8) || (ActivityRank < -8) || (ActivityRank == 0)) {
            throw new RuntimeException();
        }
        if (rank == ActivityRank) {
            progress += 3;
        }
        else if ((rank == ActivityRank + 1) || (rank == 1 && ActivityRank == -1)) {
            progress += 1;
        }
        else if ((rank < ActivityRank) && ((ActivityRank < 0) || (rank > 0))) {
            progress += 10 * (rank - ActivityRank) * (rank - ActivityRank);
        }
        else if (rank < ActivityRank && ((ActivityRank > 0) || (rank < 0))) {
            progress += 10 * (rank - ActivityRank + 1) * (rank - ActivityRank + 1);
        }
        while ((progress >= 100) && (rank < 8)) {
            rank += 1;
            if (rank == 0) {
                rank += 1;
            }
            progress -= 100;
        }
        if (rank == 8) {
            progress = 0;
        }
    }
}
