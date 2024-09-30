# Copyright (c) 2024. All rights reserved.
# DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
#
# This code is free software; you can redistribute it and/or modify it
#nder the terms of the GNU General Public License version 3 only, as
# published by the Free Software Foundation.  
#
# This code is distributed for educational purposes only, but WITHOUT
# ANY WARRANTY; See the GNU General Public License version 3 for more 
# details (a copy is included in the LICENSE file that
# accompanied this code).
# tests/test_calculator.py

import unittest
from calculator import Calculator

class TestCalculatorAddition(unittest.TestCase):
    """
    This class contains unit tests for the addition functionality of the Calculator.
    Each method tests different scenarios for the add() method.
    """

    def test_add_multiple_numbers(self):
        """Test adding multiple positive numbers."""
        self.assertEqual(Calculator.add(1, 2, 3), 6)

    def test_add_single_number(self):
        """Test adding a single number."""
        self.assertEqual(Calculator.add(0), 0)

    def test_add_no_numbers(self):
        """Test adding no numbers should return 0.0."""
        self.assertEqual(Calculator.add(), 0.0)

    def test_add_negative_numbers(self):
        """Test adding multiple negative numbers."""
        self.assertEqual(Calculator.add(-1, -1), -2)

    def test_add_floating_point_numbers(self):
        """Test adding floating-point numbers."""
        self.assertEqual(Calculator.add(1.5, 2.5), 4.0)


class TestCalculatorMultiplication(unittest.TestCase):
    """
    This class contains unit tests for the multiplication functionality of the Calculator.
    Each method tests different scenarios for the multiply() method.
    """

    def test_multiply_multiple_numbers(self):
        """Test multiplying multiple positive numbers."""
        self.assertEqual(Calculator.multiply(1, 2, 3), 6)

    def test_multiply_single_number(self):
        """Test multiplying a single number should return the same number."""
        self.assertEqual(Calculator.multiply(1), 1)

    def test_multiply_no_numbers(self):
        """Test multiplying no numbers should return 0.0."""
        self.assertEqual(Calculator.multiply(), 0.0)

    def test_multiply_negative_numbers(self):
        """Test multiplying negative numbers."""
        self.assertEqual(Calculator.multiply(-1, -1), 1)

    def test_multiply_floating_point_numbers(self):
        """Test multiplying floating-point numbers."""
        self.assertEqual(Calculator.multiply(2.5, 2), 5.0)


if __name__ == '__main__':
    # This block allows the tests to be run directly using nose2 or any unittest runner.
    unittest.main()