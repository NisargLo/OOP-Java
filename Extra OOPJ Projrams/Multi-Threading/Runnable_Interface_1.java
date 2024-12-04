// Execute Thread by implementing Runnable Interface
// By making an object of My_Thread in main() method

public class Runnable_Interface_1 {
    public static void main(String[] args) {
        My_Thread3 mt3=new My_Thread3();
        My_Thread4 mt4=new My_Thread4();
        Thread t1=new Thread(mt3);
        Thread t2=new Thread(mt4);
        t1.start();
        t2.start();
    }
}

class My_Thread3 implements Runnable{
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

class My_Thread4 implements Runnable{
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