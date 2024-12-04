// Execute Thread using Executable Framework

import java.util.concurrent.*;

class Executable_Framework {
    public static void main(String[] args) {
        Runnable r1=new Task("\nTask 1",1);
        Runnable r2=new Task("\nTask 2",2);
        Runnable r3=new Task("\nTask 3",3);
        Runnable r4=new Task("\nTask 4",4);
        Runnable r5=new Task("\nTask 5",5);
        ExecutorService pool = null;
        try {
            pool = Executors.newFixedThreadPool(3);
            pool.execute(r1);
            pool.execute(r2);
            pool.execute(r3);
            pool.execute(r4);
            pool.execute(r5);
        }
        finally{
            assert pool != null;
            pool.shutdown();
        }
    }
}

class Task implements Runnable{
    private final String name;
    private final int n;

    Task(String name, int n){
        this.name=name;
        this.n=n;
    }

    @Override
    public void run() {
        try{
            for(byte i=1;i<=n;i++){
                System.out.println(name+" executed "+i+" times.");
                Thread.sleep(500);
            }
            System.out.println(name+" - Completed");
        }
        catch (InterruptedException ie){
            ie.printStackTrace();
        }
    }
}