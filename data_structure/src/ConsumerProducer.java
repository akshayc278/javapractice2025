package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConsumerProducer {
    public static void main(String[] args) {
        ProduceConsume produceConsume = new ProduceConsume();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produceConsume.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    produceConsume.consumer();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();



    }
}

class ProduceConsume{
    List<Integer> list= new LinkedList<>();
    int capacity = 2;

    public void produce() throws InterruptedException {
        int value =0;
        synchronized (this){
            while(true){
                if(capacity==list.size()){
                    try{
                    notify();
                    wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                list.add(value);
                System.out.println("Producer produced-" + value);
                value++;
                notify();
                Thread.sleep(100);
            }
        }
    }

    public void consumer() throws InterruptedException {
        int value =0;
        synchronized (this){
            while(true){
                if(capacity!=list.size()){
                    try{
                        notify();
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                int first = list.removeFirst();
                System.out.println("Producer consumed-" + first);
                notify();
                Thread.sleep(1000);
            }
        }
    }
}
