package org.challenges;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class PrimeCheckersTest
{
    private void checkIsPrime( long number )
    {
        assertTrue( PrimeChecker.isPrime( number ), number + " should be prime" );
    }

    private void checkNotPrime( long number )
    {
        assertFalse( PrimeChecker.isPrime( number ), number + " shouldn't be prime" );
    }

    @Test
    public void testSmallPrimes()
    {
        checkIsPrime( 2 );
        checkIsPrime( 3 );
        checkIsPrime( 5 );
        checkIsPrime( 7 );
        checkIsPrime( 11 );
        checkIsPrime( 13 );
    }

        @Test
        public void testSmallNonPrimes()
        {
            checkNotPrime(4 );
            checkNotPrime(6 );
            checkNotPrime(8 );
            checkNotPrime(9 );
            checkNotPrime(12 );
        }

        @Test
        public void testUnusualNonPrimes()
        {
            checkNotPrime(1 );
            checkNotPrime(0 );
            checkNotPrime(-5 );
        }

        @Test
        public void testBiggerPrimes()
        {
            checkIsPrime(101 );
            checkIsPrime(103 );
            checkIsPrime(107 );
            checkIsPrime(109 );
        }

        @Test
        public void testVeryLargeNonPrime()
        {
            checkNotPrime(100000000000000001L);
        }

        @Test
        public void testVeryLargePrime()
        {
            checkIsPrime(100000000000000003L);
        }
}
