package com.petamind.mycalculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTestOperator {

    @Test
    public void isOperator() {
        assertTrue(MainActivity.isOperator('/'));
        assertTrue(MainActivity.isOperator('*'));
        assertTrue(MainActivity.isOperator('-'));
        assertTrue(MainActivity.isOperator('+'));
        assertFalse(MainActivity.isOperator('a'));
        assertFalse(MainActivity.isOperator('4'));
    }
}