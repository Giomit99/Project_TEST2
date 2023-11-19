package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigInteger;

class RationalTest {
    
    @Test
    void RationalTestTimesRationalIsOne(){
        
        BigInteger bInteger1 = new BigInteger("1");
        BigInteger bInteger2 = new BigInteger("1");
        BigInteger bInteger3 = new BigInteger("10");
        BigInteger bInteger4 = new BigInteger("10");

        Rational a = Rational.of(bInteger1, bInteger2);
        Rational b = Rational.of(bInteger3, bInteger4);

        assertEquals(b, a.times(b));
    }
}
