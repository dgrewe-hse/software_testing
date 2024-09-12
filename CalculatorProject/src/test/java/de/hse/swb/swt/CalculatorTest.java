/** Copyright (c) 2024. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 3 only, as
 * published by the Free Software Foundation.  
 *
 * This code is distributed for educational purposes only, but WITHOUT
 * ANY WARRANTY; See the GNU General Public License version 3 for more 
 * details (a copy is included in the LICENSE file that
 * accompanied this code).
 */
package de.hse.swb.swt;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit test for the Calculator class.
 * It tests the add and multiply methods with different sets of operands.
 * @author Dennis Grewe
 * @since 1.0
 */
class CalculatorTest {

    /**
     * Tests the add method with various scenarios including:
     * - adding positive numbers
     * - adding negative numbers
     * - adding a mix of positive and negative numbers
     * - adding with no operands (expects 0.0)
     * - adding a single number
     */
    @Test
    void testAdd() {
        // Test adding positive numbers
        assertEquals(10.0, Calculator.add(2.0, 3.0, 5.0));

        // Test adding negative numbers
        assertEquals(-10.0, Calculator.add(-2.0, -3.0, -5.0));

        // Test adding mix of positive and negative numbers
        assertEquals(0.0, Calculator.add(2.0, -2.0, 3.0, -3.0));

        // Test adding no operands (should return 0.0)
        assertEquals(0.0, Calculator.add());

        // Test adding a single number
        assertEquals(5.0, Calculator.add(5.0));
    }

    /**
     * Tests the multiply method with various scenarios including:
     * - multiplying positive numbers
     * - multiplying negative numbers
     * - multiplying with zero (expects 0.0)
     * - multiplying with no operands (expects 1.0)
     * - multiplying a single number
     */
    @Test
    void testMultiply() {
        // Test multiplying positive numbers
        assertEquals(30.0, Calculator.multiply(2.0, 3.0, 5.0));

        // Test multiplying negative numbers
        assertEquals(-30.0, Calculator.multiply(-2.0, 3.0, 5.0));

        // Test multiplying with zero
        assertEquals(0.0, Calculator.multiply(0.0, 2.0, 3.0));

        // Test multiplying no operands (should return 1.0 as per reduce initial value)
        assertEquals(1.0, Calculator.multiply());

        // Test multiplying a single number
        assertEquals(5.0, Calculator.multiply(5.0));
    }
}
