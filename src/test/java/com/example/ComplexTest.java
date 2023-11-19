package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class ComplexTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    void shouldAnswerWithTrue()
    {
        Complex calc = new Complex(0.0, 4.0);
        assertNotNull(calc);
        assertTrue(calc.isPure());
    }

    @Test
    void complexAddRealPart(){
        Complex c1 = new Complex(1, 1);
        Complex c2 = new Complex(2, 2);
        double expected = 3;
        assertEquals(expected, c1.add(c2).real);
    }
}
