package com.bootcoding.java.multithreading.assignment;

public class PalindromeThread extends Thread {
    public void run(){

        int num = 12321; // Replace with the number you want to check

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        // Check if the reversed number is equal to the original number
        return originalNum == reversedNum;
    }
    }


