package com.chenb.thread;

/**
 * runable
 */
public class NewRunnable {

    private static class UseRunable implements Runnable{

        public void run() {
            String name = Thread.currentThread().getName();
            while (!Thread.currentThread().isInterrupted()){
                System.out.println(name + " is run!");
            }
            System.out.println(name + " 已经中断");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        UseRunable useRunable = new UseRunable();
        Thread thread = new Thread(useRunable);
        thread.start();
        thread.sleep(20);
        thread.interrupt();
    }
}
