package com.bootcoding.java.multithreading.assignment;

public class FibonacciThread extends Thread {
    public void run(){
        int n = 10; // Number of Fibonacci numbers to generate
        int first = 0;
        int second = 1;
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
