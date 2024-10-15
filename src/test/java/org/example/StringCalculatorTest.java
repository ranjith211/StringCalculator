package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest  {

    StringCalculator stringCalculator=new StringCalculator();

    @Test
    void testStringCalculator_add()
    {
        assertEquals(stringCalculator.add(""),0);
        assertEquals(stringCalculator.add("1"),1);
        assertEquals(stringCalculator.add("1,2"),3);
    }

}