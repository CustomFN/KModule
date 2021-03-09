package com.z.kmodule.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PC {

    private  BlockingQueue queue = new ArrayBlockingQueue(10);
    private  AtomicInteger itemCounter = new AtomicInteger(1);
    private  Lock lock;
    private  Condition noFull;
    private  Condition noEmpty;



    public PC() {
        this.lock = new ReentrantLock();
        this.noEmpty = lock.newCondition();
        this.noFull = lock.newCondition();
    }

    public static void main(String[] args) {
        PC pc = new PC();
//        for (int i = 0; i < 5; i++) {
            new Thread(pc.new P()).start();
//        System.out.println("start");
//        }
//
//        for (int i = 0; i < 5; i++) {
            new Thread(pc.new C()).start();
//        }
    }

     class P implements Runnable {

        @Override
        public void run() {
//            lock.lock();
            try {
                while (itemCounter.get() < 1000) {
//                while (true) {
//                    if (queue.size() == 10) {
//                        noFull.await();
//                    }
                    queue.put(itemCounter.getAndIncrement());
//                    noEmpty.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
//                lock.unlock();
            }


//            System.out.println("start - ");
//            while (true) {
//                System.out.println("start - -");
//                queue.offer(itemCounter.getAndIncrement());
//                if (!queue.isEmpty()) {
//                    break;
//                }
//            }
//            System.out.println("end - ");
//            queue.stream().forEach(System.out::println);
        }
    }

     class C implements Runnable {

        @Override
        public void run() {
//            lock.lock();
            try {
                while (true) {
//                    if (queue.isEmpty()) {
//                        noEmpty.await();
//                    }
                    Object item = queue.take();
                    System.out.println(item);
//                    noFull.signal();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
//                lock.unlock();
            }

//            Object item = queue.poll();
//            System.out.println(item);
        }
    }
}
