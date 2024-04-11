/*
    Producer-Consumer Program
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
    int c = 50000;

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
            Thread.sleep(100);
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
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}