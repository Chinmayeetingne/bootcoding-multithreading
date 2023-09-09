package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class NameGenerator {
    private static String[] names =
            {"Ramesh", "Suresh", "Jayesh", "Ganesh",
                    "Mahesh", "Rajesh", "Mitesh", "Dinesh",
                    "Pooja", "Priya", "Pinky",
                    "Manisha", "Usha", "Asha", "Diksha", "Nisha"};

    public static String getName() {
        int randomIndex = random.nextInt(names.length);
        return names[randomIndex];
    }

    private static Random random = new Random();
}
