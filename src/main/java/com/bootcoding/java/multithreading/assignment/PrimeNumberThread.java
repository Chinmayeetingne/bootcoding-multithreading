package com.bootcoding.java.multithreading.assignment;

public class PrimeNumberThread extends Thread {
    public void run(){
        int num = 29; // Replace with the number you want to check

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Divisible by 2 or 3, not prime
        }

        // Check for prime using 6k +/- 1 optimization
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // Divisible by i or i+2, not prime
            }
        }

        return true; // If not divisible by any number up to sqrt(num), it's prime
    }

}
