// Implementing Thread by extending Thread Class

public class Thread_Class {
    public static void main(String[] args) {
        new My_Thread1();
        new My_Thread2();
        try{
            for(byte i=1;i<=5;i++){
                System.out.println("\nMain Thread - "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException ie){
            System.out.println("\nMain Thread Interrupted");
        }
        System.out.println("\nMain Thread Exiting");
    }
}

class My_Thread1 extends Thread{
    My_Thread1(){
        super("Demo Thread One");
        setPriority(10);
        System.out.println("\nChild Thread One - "+this);
        start();
    }

    @Override
    public void run(){
        try{
            for(byte i=1;i<=5;i++){
                System.out.println("\nChild Thread One - "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException ie){
            System.out.println("\nChild Thread One Interrupted");
        }
        System.out.println("\nChild Thread One Exiting");
    }
}

class My_Thread2 extends Thread{
    My_Thread2(){
        super("Demo Thread Two");
        setPriority(1);
        System.out.println("\nChild Thread Two - "+this);
        start();
    }

    @Override
    public void run(){
        try{
            for(byte i=1;i<=5;i++){
                System.out.println("\nChild Thread Two - "+i);
                Thread.sleep(500);
            }
        }
        catch (InterruptedException ie){
            System.out.println("\nChild Thread Two Interrupted");
        }
        System.out.println("\nChild Thread Two Exiting");
    }
}