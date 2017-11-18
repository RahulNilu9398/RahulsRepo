package com.rahul.thread;

public class FirstThread {
    public static void main(String[] args){
        System.out.println("Helo from First Thread");

        Thread anotherThread=new AnotherThread();
        anotherThread.start();

        Thread thread=new Thread(){
            public void run(){
                System.out.println("Hi from anonymous");
            }
        };
        thread.start();

        System.out.println("Hello again from First Thread");

    }
}
