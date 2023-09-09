package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class OTPGenerator {
    final static int MAX = 999999;
    final static int MIN = 100000;


    public static int getRandomOTP() {
        int number = random.nextInt(MAX - MIN);
        return MIN + number;
    }


    private static Random random = new Random();
}
