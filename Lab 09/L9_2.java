/*
    Write a program to create two threads, one thread will print odd numbers and second thread will print even numbers between 1 to 20 numbers.

    (Execute Thread by Executable Framework)
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class L9_2 {
    public static void main(String[] args) {
        Runnable r1=new Print_Odd_Numbers("\nOdd Numbers between 1 to 20");
        Runnable r2=new Print_Even_Numbers("\nEven Numbers between 1 to 20");
        ExecutorService pool = Executors.newFixedThreadPool(2);
        pool.execute(r1);
        pool.execute(r2);
        pool.shutdown();
    }
}

class Print_Odd_Numbers implements Runnable{
    private final String name;
    int o=3;

    Print_Odd_Numbers(String name){
        this.name = name;
    }
    
    @Override
    public void run(){
        while (o>1 && o<20) {
            try {
                System.out.println("\n"+o);
                o+=2;
                Thread.sleep(1000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name+" - Completed");
    }
}

class Print_Even_Numbers implements Runnable{
    private final String name;
    int e=2;

    Print_Even_Numbers(String name){
        this.name = name;
    }

    @Override
    public void run(){
        while (e>1 && e<20) {
            try {
                System.out.println("\n" + e);
                e += 2;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " - Completed");
    }
} 