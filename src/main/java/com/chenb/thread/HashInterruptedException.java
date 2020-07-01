package com.chenb.thread;

public class HashInterruptedException {

    public static class HashRunable implements Runnable{
        public void run() {
            while (!Thread.currentThread().isInterrupted()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " is1 " + Thread.currentThread().isInterrupted());
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
            System.out.println(Thread.currentThread().getName() + " is " + Thread.currentThread().isInterrupted());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        HashRunable hashRunable = new HashRunable();
        Thread thread = new Thread(hashRunable);
        thread.start();
        thread.sleep(20);
        thread.interrupt();
    }
}
