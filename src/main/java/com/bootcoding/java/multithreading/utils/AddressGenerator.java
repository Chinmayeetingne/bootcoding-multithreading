package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class AddressGenerator {
    private static String[] addresses =
            {"KR Pandav College, New Nandanwan",
                    "Trillium VR, Medical Square",
                    "Beside Haldiram, Ajni Square",
                    "Bhole Petrol pump, Civil Lines",
                    "opposite Batukbhai Jewellers, Dharampeth",
                    "Sangam Mithai, Manish nagar"};

    // Naming Convention
    public static String getAddress() {

        int randomIndex = random.nextInt(addresses.length);
        String address = addresses[randomIndex];
        return address;
    }

    private static Random random = new Random();
}
