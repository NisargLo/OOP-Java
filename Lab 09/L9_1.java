/*
    Write an application that executes two threads. 
    One thread displays "Good Morning" every 1000 milliseconds & another thread displays "Good Afternoon" every 3000 milliseconds. 
    Create the threads by implementing the Runnable interface.

    (Execute Thread by implementing Runnable Interface - Using Anonymous Object)
 */

public class L9_1 {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable(){
            public void run(){
                try{
                    while(true){
                        System.out.print("\nGood  Afternoon\n");
                        Thread.sleep(3000);
                    }
                }
                catch (InterruptedException ie){
                    ie.printStackTrace();
                    System.out.println("\nThread Interrupted");
                }
            }
        });
        t.start();
        while(true){
            try{
                System.out.println("\nGood Morning\n");
                Thread.sleep(1000);
            }
            catch(InterruptedException ie){
                ie.printStackTrace();
                System.out.println("\nThread Interrupted");
            }
        }
    }
}