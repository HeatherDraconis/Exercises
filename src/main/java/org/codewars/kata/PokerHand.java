package org.codewars.kata;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PokerHand {
    private final List<Integer> cardValues;
    private final List<Character> cardSuits;

    public enum Result {
        TIE,
        WIN,
        LOSS
    }

    PokerHand(String cards) {
        String[] cardArray = cards.split(" ");
        cardValues = Arrays.stream(cardArray).map(c -> getNum(c.charAt(0))).toList();
        cardSuits = Arrays.stream(cardArray).map(c -> c.charAt(1)).toList();
    }

    public Result compareWith(PokerHand hand) {
        if (isRoyalFlush() && hand.isRoyalFlush()) return Result.TIE;
        if (isRoyalFlush()) return Result.WIN;
        if (hand.isRoyalFlush()) return Result.LOSS;

        if (isStraightFlush() && hand.isStraightFlush()) return compareRemainder(hand);
        if (isStraightFlush()) return Result.WIN;
        if (hand.isStraightFlush()) return Result.LOSS;

        if (hasFourOfAKind() && getFourOfAKind() == hand.getFourOfAKind()) return compareRemainder(hand);
        if (getFourOfAKind() > hand.getFourOfAKind()) return Result.WIN;
        if (getFourOfAKind() < hand.getFourOfAKind()) return Result.LOSS;

        if (hasFullHouse() && getFullHouse() == hand.getFullHouse()) return compareRemainder(hand);
        if (getFullHouse() > hand.getFullHouse()) return Result.WIN;
        if (getFullHouse() < hand.getFullHouse()) return Result.LOSS;

        if (isFlush() && hand.isFlush()) return compareRemainder(hand);
        if (isFlush()) return Result.WIN;
        if (hand.isFlush()) return Result.LOSS;

        if (isStraight() && hand.isStraight()) return compareRemainder(hand);
        if (isStraight()) return Result.WIN;
        if (hand.isStraight()) return Result.LOSS;

        if (hasThreeOfAKind() && getThreeOfAKind() == hand.getThreeOfAKind()) return compareRemainder(hand);
        if (getThreeOfAKind() > hand.getThreeOfAKind()) return Result.WIN;
        if (getThreeOfAKind() < hand.getThreeOfAKind()) return Result.LOSS;

        if (hasTwoPairs() && hand.hasTwoPairs()) return compareRemainder(hand);
        if (hasTwoPairs()) return Result.WIN;
        if (hand.hasTwoPairs()) return Result.LOSS;

        if (hasPair() && hand.hasPair()) return compareRemainder(hand);
        if (hasPair()) return Result.WIN;
        if (hand.hasPair()) return Result.LOSS;

        return compareRemainder(hand);
    }

    private boolean hasPair() {
        return getPair() != 0;
    }

    private boolean hasTwoPairs() {
        return getTwoPairs() != 0;
    }

    private boolean hasThreeOfAKind() {
        return getThreeOfAKind() != 0;
    }

    private boolean hasFullHouse() {
        return getFullHouse() != 0;
    }

    private boolean hasFourOfAKind() {
        return getFourOfAKind() != 0;
    }

    private int getFourOfAKind() {
        return getOfAKind(0, 4);
    }

    private int getPair() {
        return getOfAKind(0, 2);
    }

    private int getThreeOfAKind() {
        return getOfAKind(0, 3);
    }

    private boolean isStraightFlush() {
        return isFlush() && isStraight() && !isRoyalFlush();
    }

    private boolean isRoyalFlush() {
        return isFlush() && IntStream.of(10, 11, 12, 13, 14).allMatch(cardValues::contains);
    }

    private boolean isFlush() {
        return IntStream.of(1, 2, 3, 4).allMatch(i -> (char) cardSuits.get(0) == cardSuits.get(i));
    }

    private boolean isStraight() {
        return Stream.of(IntStream.of(14, 2, 3, 4, 5),
                        IntStream.of(2, 3, 4, 5, 6),
                        IntStream.of(3, 4, 5, 6, 7),
                        IntStream.of(4, 5, 6, 7, 8),
                        IntStream.of(5, 6, 7, 8, 9),
                        IntStream.of(6, 7, 8, 9, 10),
                        IntStream.of(7, 8, 9, 10, 11),
                        IntStream.of(8, 9, 10, 11, 12),
                        IntStream.of(9, 10, 11, 12, 13),
                        IntStream.of(10, 11, 12, 13, 14))
                .anyMatch(stringStream -> stringStream.allMatch(cardValues::contains));
    }

    private int getFullHouse() {
        return hasThreeOfAKind() && getOfAKind(getThreeOfAKind(), 2) != 0 ? getThreeOfAKind() : 0;
    }

    private int getTwoPairs() {
        return hasPair() ? getOfAKind(getPair(), 2) : 0;
    }

    private int getOfAKind(int knownCard, int howMany) {
        return IntStream.range(0, 15).filter(j -> knownCard != j && cardCount(j) == howMany).findFirst().orElse(0);
    }

    private Result compareRemainder(PokerHand hand) {
        int thisMaxCard = getMaxCard(hand);
        int handMaxCard = hand.getMaxCard(this);
        if (thisMaxCard > handMaxCard) {
            return Result.WIN;
        }
        if (thisMaxCard == handMaxCard) {
            return Result.TIE;
        }
        return Result.LOSS;
    }

    private int getMaxCard(PokerHand hand) {
        return cardValues.stream().filter(card -> cardCount(card) > hand.cardCount(card)).max(Integer::compareTo).orElse(0);
    }

    private long cardCount(int card) {
        return IntStream.range(0, 5).filter(i -> cardValues.get(i) == card).count();
    }

    private int getNum(char card) {
        return switch (card) {
            case 'T' -> 10;
            case 'J' -> 11;
            case 'Q' -> 12;
            case 'K' -> 13;
            case 'A' -> 14;
            default -> Character.getNumericValue(card);
        };
    }
}
