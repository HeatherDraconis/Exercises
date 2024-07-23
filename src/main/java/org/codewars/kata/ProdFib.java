package org.codewars.kata;

public class ProdFib {
    public static long[] productFib(long prod) {
        long fibTerm = 0;
        long nextTerm = 1;
        while( fibTerm * nextTerm < prod ) {
            long fibTermPrev = fibTerm;
            fibTerm = nextTerm;
            nextTerm = fibTermPrev + fibTerm;
        }
        int isMultiple = fibTerm * nextTerm == prod ? 1 : 0;
        return new long[]{fibTerm, nextTerm, isMultiple};
    }
}
