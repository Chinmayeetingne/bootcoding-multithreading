package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class AuthorNameGenerator {
    private static String[] bookAuthors = {
            "David A. Patterson",
            "John L. Hennessy",
            "Michael Sipser",
            "Andrew S. Tanenbaum",
            "Larry L. Peterson",
            "M. Morris Mano",
            "Charles Petzold",
            "Randal E. Bryant",
            "David R. O'Hallaron",
            "Jonathan W. Valvano",
            "Sanjay D. Patel",
            "Zhihua Qu",
            "V. Carl Hamacher",
            "John P. Hayes",
            "Abraham Silberschatz",
            "Peter B. Galvin",
            "Greg Gagne",
            "James L. Hennessy",
            "David L. Tarnoff",
            "William Stallings",
    };




    public static String getName() {

        int randomIndex = random.nextInt(bookAuthors.length);
        return bookAuthors[randomIndex];
    }

    private static Random random = new Random();
}
