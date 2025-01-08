package org.codewars.kata;

import java.util.*;

public class Cards {
    static int count;
    static Map<Long, Long> number = new HashMap<>();
    static Map<Long, Long[]> numbers;

    public static long cardGame(long n) {
        long alice = 0;
        boolean isAlice = true;
        while (n > 0) {
            long nNew;
            if (n % 2 == 0 && (n % 4 != 0 || n / 2 == 2)) {
                nNew = n / 2;
            } else {
                nNew = n - 1;
            }
            if (isAlice) {
                alice = alice + n - nNew;
            }
            isAlice = !isAlice;
            n = nNew;
        }
        return alice;
    }





    public static long cardGame2(long n) {
        numbers = new HashMap<>();
        numbers.put(0L, new Long[]{0L, 0L});
        for (long i = 1; i <= n; i++) {
            numbers.put(i,
                    i % 2 == 0 && i != 2 && numbers.get(i / 2)[1] + i / 2 > numbers.get(i - 1)[1] + 1 ?
                    new Long[]{numbers.get(i / 2)[1] + i / 2, numbers.get(i / 2)[0]} :
                    new Long[]{numbers.get(i - 1)[1] + 1, numbers.get(i - 1)[0]});
            numbers.remove(i / 2 - 1);
        }
        return numbers.get(n)[0];
    }

    private static long getAlice(long n, long alice) {
        if (n <= 0) {
            return alice;
        }
        if (number.containsKey(n)) {
            return alice + number.get(n);
        }
        long aliceFinal = n % 2 == 0 ? Math.max(
                getAlice(n / 2 % 2 == 0 ? n / 4 : n / 2 - 1, alice + n / 2),
                getAlice(n - 2, alice + 1))
                : getAlice((n - 1) / 2, alice + 1);
        number.put(n, aliceFinal - alice);
        return aliceFinal;
    }

    private static Long[] getCards(long n, Long[] cards, int player) {
        count++;
        if (n == 0 || count == 1_000) {
            return cards;
        }
        if (numbers.containsKey(n)) {
            return player == 0 ? new Long[]{cards[0] + numbers.get(n)[0], cards[1] + numbers.get(n)[1]} : new Long[]{cards[0] + numbers.get(n)[1], cards[1] + numbers.get(n)[0]};
        }
        Long[] cardsEven = new Long[2];
        if (n % 2 == 0 && n != 2) {
            cardsEven = getCards(n / 2, player == 0 ? new Long[]{cards[0] + n / 2, cards[1]} :  new Long[]{cards[0], cards[1] + n / 2}, player == 0 ? 1 : 0);
        }
        Long[] cardsNew = getCards(n - 1,  player == 0 ? new Long[]{cards[0] + 1, cards[1]} :  new Long[]{cards[0], cards[1] + 1}, player == 0 ? 1 : 0);
        if (n % 2 == 0) {
            cardsNew = cardsEven[player] > cardsNew[player] ? cardsEven : cardsNew;
        }
        numbers.put(n, player == 0 ? new Long[]{cardsNew[0] -cards[0], cardsNew[1] - cards[1]} : new Long[]{cardsNew[1] - cards[1], cardsNew[0] -cards[0]});
        return cardsNew;
    }
}
