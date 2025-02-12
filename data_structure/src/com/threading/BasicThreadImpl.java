package com.threading;

public class BasicThreadImpl{
    public static class ThreadClassBase extends Thread{
        public void run(){
            System.out.println("Hi I am Thread");
        }
    }

    public static void main(String[] args) {
        BasicThreadImpl basicThread = new BasicThreadImpl();
        //first way of thread impl
        ThreadClassBase threadClassBase = new ThreadClassBase();
        threadClassBase.start();
        System.out.println(Thread.currentThread().getName());

        //second way of thread impl
        Runnable runnable1 =new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Thread going to sleep "+Thread.currentThread().getName());
                    Thread.sleep(50);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Hi I am runnable1 in main");
            }
        };
        Runnable runnable2 =new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running now "+Thread.currentThread().getName());
                System.out.println("Hi I am runnable2 in main");
            }
        };
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        thread1.start();
        thread2.start();
        //third way of thread impl
        RunnableClass runnableClass = new RunnableClass();
        Thread thredRunnable = new Thread(runnableClass);
        thredRunnable.start();
        //fourth way
        Runnable runnableLambda = ()->{
            System.out.println("Running Lambda thread");
        };
        Thread lambda = new Thread(runnableLambda);
        lambda.start();

    }

    public static class RunnableClass implements Runnable{

        @Override
        public void run() {
            System.out.println("Class runnable");
        }
    }
}
