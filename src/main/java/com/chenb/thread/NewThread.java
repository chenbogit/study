package com.chenb.thread;


/**
 * thrad
 */
public class NewThread {

    private static class UseThread extends Thread{
        @Override
        public void run() {
            String name = Thread.currentThread().getName();
            while (!isInterrupted()){
                System.out.println(name + " is run!");
            }
            System.out.println(name + " 已中断");
        }
    }


    public static void main(String[] args) throws InterruptedException {
        UseThread useThread = new UseThread();
        useThread.start();
        useThread.sleep(20);
        useThread.interrupt();
    }
}
