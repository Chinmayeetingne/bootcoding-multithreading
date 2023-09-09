package com.bootcoding.java.multithreading;

import com.bootcoding.java.multithreading.mythread.AlphabetThread;
import com.bootcoding.java.multithreading.mythread.NumberThread;
import com.bootcoding.java.multithreading.mythread.SpecialSymbolThread;
import com.bootcoding.java.multithreading.store.bag.BagService;
import com.bootcoding.java.multithreading.store.book.BookService;
import com.bootcoding.java.multithreading.store.bottle.BottleService;

public class Shopkeeper {
    public static void main(String[] args) {
        // Using Thread
        Thread t1 = new NumberThread();
        t1.start();
        Thread t2 = new AlphabetThread();
        t2.start();
        Thread t3 = new SpecialSymbolThread();
        t3.start();

        // Using Runnable
        Thread t11 = new Thread(new BookService(1000));
        Thread t22 = new Thread(new BottleService(1000));
        Thread t33 = new Thread(new BagService(1000));
        t11.start();
        t22.start();
        t33.start();

    }
}

