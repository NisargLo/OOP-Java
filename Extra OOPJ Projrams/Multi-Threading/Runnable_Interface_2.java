// Execute Thread by implementing Runnable Interface
// By not making an object of My_Thread in main() method. (Using Anonymous Object)

public class Runnable_Interface_2 {
    public static void main(String[] args) {
        Thread t1=new Thread(new Runnable(){
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
        });
        Thread t2=new Thread(new Runnable(){
            public void run() {
                try {
                    for (byte i=1; i<=5; i++) {
                        System.out.println("\nChild Thread Two - " + i);
                        Thread.sleep(500);
                    }
                } catch (InterruptedException ie) {
                    System.out.println("\nChild Thread Two Interrupted");
                }
                System.out.println("\nChild Thread Two Exiting");
            }
        });
        t1.start();
        t2.start();
    }
}