// Execute Thread using Synchronized Methods

public class Synchronized_Methods {
    public static void main(String[] args) {
        PrintTable pt = new PrintTable();
        Table1 t1 = new Table1(pt);
        Table2 t2 = new Table2(pt);
        t1.start();
        t2.start();
    }
}

class Table1 extends Thread {
    private PrintTable pt;

    Table1(PrintTable obj) {
        pt = obj;
    }

    public void run() {
        synchronized (pt){
            pt.printTable(2);
        }
    }
}

class Table2 extends Thread {
    private PrintTable pt;

    Table2(PrintTable obj) {
        pt = obj;
    }

    public void run() {
        synchronized (pt){
            pt.printTable(10);
        }
    }
}

class PrintTable {
    synchronized void printTable(int a) {
        System.out.println("\nTable of "+a+" :-");
        for (byte i = 1; i <= 10; i++) {
            if(i==1){
                System.out.println();
            }
            System.out.println(a + " X " + i + " = " + (a * i));
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}