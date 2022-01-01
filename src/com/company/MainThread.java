package com.company;

public class MainThread
{
    public static void main(String[] args) {
Thread t=Thread.currentThread();
        System.out.println("Cureent thread "+t);
        t.setName("My new thread");
        System.out.println("After changing thread : "+t);
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Main thread intrupted ");
            }
        }

    }
}
