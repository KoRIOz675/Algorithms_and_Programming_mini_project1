package org.isep;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        assertEquals(4, Calculator.add(2,2));
    }
}