package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class ColorGenerator {
    private static String[] bottleColors = {
            "Transparent",
            "Blue",
            "Green",
            "Red",
            "Yellow",
            "Pink",
            "Purple",
            "Orange",
            "Black",
            "White",
            "Silver",
            "Gold",
            "Brown",
            "Clear",
            "Aqua",
            "Lavender",
            "Turquoise",
            "Magenta",
            "Teal",
            "Olive",
    };

    public static String getName() {

        int randomIndex = random.nextInt(bottleColors.length);
        return bottleColors[randomIndex];
    }
    private static Random random = new Random();
}
