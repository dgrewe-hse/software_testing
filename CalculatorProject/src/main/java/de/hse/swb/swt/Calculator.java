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

import java.util.stream.DoubleStream;

/**
 * The Calculator class provides methods to perform basic arithmetic operations
 * such as addition and multiplication using streams.
 * @author Dennis Grewe
 * @since 1.0
 */
public class Calculator {

    /**
     * Adds the provided operands and returns the sum.
     *
     * @param operands an array of double values to be added
     * @return the sum of the operands, or 0.0 if no operands are provided
     */
    static double add(double... operands) {
        return DoubleStream.of(operands)
                           .sum();
    }

    /**
     * Multiplies the provided operands and returns the product.
     *
     * @param operands an array of double values to be multiplied
     * @return the product of the operands, or 1.0 if no operands are provided
     */
    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                           .reduce(1, (a, b) -> a * b);
    }
}