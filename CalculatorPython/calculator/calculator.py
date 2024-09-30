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

class Calculator:
    """
    This is a simple calculator class for basic arithmetic operations and for teaching
    purposes only. Only sum and multiply are supported right now.
    """

    @staticmethod
    def add(*operands):
        """
        Adds the provided operands and returns the sum.

        :param operands: A variable number of operands (numbers) to be added.
        :return: The sum of the operands.
        """
        if not operands:
            return 0.0
        return sum(operands)

    @staticmethod
    def multiply(*operands):
        """
        Multiplies the provided operands and returns the product.

        :param operands: A variable number of operands (numbers) to be multiplied.
        :return: The product of the operands.
        """
        if not operands:
            return 0.0
        result = 1
        for operand in operands:
            result *= operand
        return result