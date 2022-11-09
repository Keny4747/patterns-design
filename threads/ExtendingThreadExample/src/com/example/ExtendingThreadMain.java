package com.example;

public class ExtendingThreadMain {

    public static void main(String[] args) {
        ExampleThread t1 = new ExampleThread();
        t1.start();
        ExampleThread t2 = new ExampleThread();
        t2.start();
//        ExampleThread t3 = new ExampleThread();
//        t3.start();
        
    }
}