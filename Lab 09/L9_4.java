/*
    It is required to have total two threads, both capable of acting as a produce as well as a consumer.
    If first thread acts as a producer then, the second thread becomes the consumer and vice-versa.
    They communicate with each other through a buffer, storing one integer number.
    One of the threads initiates the communication by sending 1 to the other thread.
    The second thread, on receiving 1 sends 2 to the first thread.
    On receiving 2, the first thread sends three integer numbers, one by one to the second thread.
    The second thread consumes the numbers by displaying them.
    Both threads terminate after that.
    Note that both threads must be capable of initiating the communication.
    Write complete multi-threaded program to meet above requirements.

    (Producer-Consumer Program)
 */

public class L9_4 {
    public static void main(String[] args) {
        iPhones ip = new iPhones();
        Thread producersThread = new Thread(new Producers(ip));
        Thread consumersThread = new Thread(new Consumers(ip));
        producersThread.start();
        consumersThread.start();
    }
}

class Producers implements Runnable {
    final private iPhones ip;

    public Producers(iPhones ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        while (true) {
            ip.produce();
        }
    }
}

class Consumers implements Runnable {
    final private iPhones ip;

    public Consumers(iPhones ip) {
        this.ip = ip;
    }

    @Override
    public void run() {
        while (true) {
            ip.consume();
        }
    }
}

class iPhones {
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