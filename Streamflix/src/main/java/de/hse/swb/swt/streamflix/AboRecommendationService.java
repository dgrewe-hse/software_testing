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
package de.hse.swb.swt.streamflix;

/**
 * This class represents a recommendation service for StreamFlix subscriptions.
 */
public class AboRecommendationService {

    /**
     * Recommends the most cost-effective Abo model based on the user's preferences.
     * 
     * @param requiresNoAds      Whether the user wants an ad-free experience.
     * @param devicesToWatch      Number of devices the user wants to watch on simultaneously.
     * @param requiresUltraHD     Whether the user wants Ultra-HD quality.
     * @param devicesToDownload   Number of devices the user wants to download content on.
     * @return The recommended Abo model as a String: "W", "B", "S", or "P".
     * 
     * Example call: String recommendedAbo = recommendModel(true, 4, true, 6);
     */
    public static String recommendModel(boolean requiresNoAds, int devicesToWatch, boolean requiresUltraHD, int devicesToDownload) {
        // Premium model (P)
        if (requiresNoAds && requiresUltraHD && devicesToWatch > 2 && devicesToDownload > 2) {
            return "P"; // Premium
        }
        
        // Standard model (S)
        if (requiresNoAds && devicesToWatch <= 2 && devicesToDownload >= 2) {
            return "S"; // Standard
        }

        // Basis model (B)
        if (requiresNoAds && devicesToWatch >= 2 && devicesToDownload == 1) {
            return "B"; // Basis
        }

        // Standard-Abo with ads (W)
        return "W"; // Standard Abo with Ads
    }
}