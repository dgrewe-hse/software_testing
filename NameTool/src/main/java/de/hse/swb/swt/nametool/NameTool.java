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
package de.hse.swb.swt.nametool;

/**
 * Utility class for handling and manipulating names.
 */
public class NameTool {

    /**
     * Maximum allowed length for the combined name string.
     */
    private static final int LIMIT = 15;

    /**
     * Combines two name strings, separated by a space. If the combined length
     * exceeds a defined limit, the result is truncated to the maximum allowed length.
     *
     * @param s1 the first part of the name
     * @param s2 the second part of the name
     * @return the combined name string, truncated if it exceeds the maximum length
     */
    public static String newName(String s1, String s2) {
        // Concatenate s1 and s2 with a space in between
        String s3 = s1 + " " + s2;

        // Check if the length of s1 exceeds the limit
        if (s1.length() > LIMIT) {
            // Return the combined string truncated to the limit
            return s3.substring(0, LIMIT);
        }

        // Return the full combined name if it doesn't exceed the limit
        return s3;
    }
}