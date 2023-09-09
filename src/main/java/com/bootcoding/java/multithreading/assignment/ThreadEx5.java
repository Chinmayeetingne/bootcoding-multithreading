package com.bootcoding.java.multithreading.assignment;

import com.bootcoding.java.multithreading.mythread.NumberThread;

public class ThreadEx5 {
    public static void main(String[] args) {
        Thread t1 = new PalindromeThread();
        t1.start();
        Thread t2 = new FibonacciThread();
        t2.start();
        Thread t3 = new PrimeNumberThread();
        t3.start();
    }
}
