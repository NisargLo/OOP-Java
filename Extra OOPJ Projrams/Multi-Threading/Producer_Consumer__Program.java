/*
    Producer-Consumer Program
    (Producer makes iPhone, while Consumer buys iPhone, both happen parallel at an interval of 250 milliseconds.)
 */

public class Producer_Consumer__Program {
    public static void main(String[] args) {
        iPhone ip = new iPhone();
        Thread producerThread = new Thread(new Producer(ip));
        Thread consumerThread = new Thread(new Consumer(ip));
        producerThread.start();
        consumerThread.start();
    }
}

class Producer implements Runnable {
    final private iPhone ip;

    public Producer(iPhone ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        while (true) {
            ip.produce();
        }
    }
}

class Consumer implements Runnable {
    final private iPhone ip;

    public Consumer(iPhone ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        while (true) {
            ip.consume();
        }
    }
}

class iPhone {
    private int c = 50000;

    synchronized protected void produce() {
        while (c >= 100000) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        c++;
        System.out.println("Producer increased count of iPhone : " + c);
        notifyAll();
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized protected void consume() {
        while (c <= 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        c--;
        System.out.println("Consumer decreased count of iPhone : " + c);
        notifyAll();
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}