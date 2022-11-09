package com.example;

public class ImplementingRunnableMain {

    public static void main(String[] args) {
        ExampleRunnable r1 = new ExampleRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
        ExampleRunnable r2 = new ExampleRunnable();
        Thread t2 = new Thread(r2);
        t2.start();
        
    }
}