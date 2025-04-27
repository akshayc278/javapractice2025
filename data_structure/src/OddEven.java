package org.example;

class Calc {
    volatile int count = 1;
    static int n;

    public void printOdd() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 == 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.fillInStackTrace();
                    }
                }
                System.out.println(count);
                count++;
                notify();
            }
        }
    }
    public void printEven() {
        synchronized (this) {
            while (count < n) {
                while (count % 2 != 0) {
                    try {
                        wait();
                    } catch (Exception e) {
                        e.fillInStackTrace();
                    }
                }
                System.out.println(count);
                count++;
                notify();
            }
        }
    }

    public static void main(String[] args) {
        Calc calc= new Calc();
        n=10;
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                calc.printEven();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                calc.printOdd();

            }
        });

        t1.start();
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}