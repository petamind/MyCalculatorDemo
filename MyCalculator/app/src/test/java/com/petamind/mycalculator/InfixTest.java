package com.petamind.mycalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InfixTest {
    Infix infixObj;
    @Before
    public void setUp() throws Exception {
        //TODO: init the infixObj
        infixObj = new Infix();
    }

    @Test
    public void infix() {
        //TODO: create 3 expressions and use assert.Equals/True/... to test
        String exp1 = "1 + 2 + 3";
        assertTrue(6.0 == infixObj.infix(exp1));

        String exp2 = "1 + 2 * 3";
        assertTrue(7.0 == infixObj.infix(exp2));
    }

    @Test(expected = ArithmeticException.class)
    public void infix2() {
        //TODO: create 3 expressions and use assert.Equals/True/... to test

        String exp3 = "1 + 2 / 0";
        infixObj.infix(exp3);
    }

    @Test
    public void getPriority() {
        //TODO: create 3 expressions and use assert.Equals/True/... to test
    }
}