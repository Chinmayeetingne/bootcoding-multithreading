package com.bootcoding.java.multithreading.mythread;

public class NumberThread extends Thread{
    public void run(){
        for(int i = 0; i < 100; i++) {
            System.out.println("Number Task is executed!");
        }
    }
}
