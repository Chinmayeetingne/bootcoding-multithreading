package com.bootcoding.java.multithreading.utils;

import java.util.Random;

public class BookNameGenerator {
    private static String[] books = {
            "Computer Organization and Design: The Hardware/Software Interface",
            "Introduction to the Theory of Computation",
            "Computer Networks: Principles, Algorithms, and Applications",
            "Digital Design: Principles and Practices",
            "Computer Architecture: A Quantitative Approach",
            "Operating System Concepts",
            "Computer Systems: A Programmer's Perspective",
            "Embedded Systems: Introduction to Arm Cortex-M Microcontrollers",
            "Introduction to Computer Engineering",
            "Computer Engineering: Hardware Design",
            "Computer Engineering: Principles and Practice",
            "Computer Engineering: Concepts, Methodologies, Tools, and Applications",
            "Microprocessor Architecture, Programming, and Applications with the 8085",
            "Modern Operating Systems",
            "Engineering a Compiler",
            "Computer Organization and Architecture",
            "Fundamentals of Digital Logic with Verilog Design",
            "Introduction to Embedded Systems",
            "Computer Graphics: Principles and Practice",
            "Computer Engineering and Technology: 23rd CCF Conference",
    };



    public static String getName() {
        int randomIndex = random.nextInt(books.length);
        return books[randomIndex];
    }


    private static Random random = new Random();
}
