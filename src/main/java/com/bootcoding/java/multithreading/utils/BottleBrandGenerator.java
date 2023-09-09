package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class BottleBrandGenerator {
    private static String[] indianBottleBrands = {
            "Tupperware",
            "Milton",
            "Cello",
            "Signoraware",
            "Tritan",
            "Borosil",
            "Vaya",
            "Butterfly",
            "Prestige",
            "Croma",
            "Pigeon",
            "Jaypee Plus",
            "NanoNine",
            "Taluka",
            "Treo",
            "Femora",
            "Classic Essentials",
            "Solimo",
            "Princeware",
            "Flasky",
    };

    public static String getName() {
        int randomIndex = random.nextInt(indianBottleBrands.length);
        return indianBottleBrands[randomIndex];
    }

    private static Random random = new Random();
}
