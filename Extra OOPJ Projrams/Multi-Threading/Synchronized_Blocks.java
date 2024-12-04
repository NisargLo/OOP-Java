// Execute Thread using Synchronized Blocks

public class Synchronized_Blocks {
    public static void main(String[] args) {
        PrintTable2 pt2 = new PrintTable2();
        Table3 t3 = new Table3(pt2);
        Table4 t4 = new Table4(pt2);
        t3.start();
        t4.start();
    }
}

class Table3 extends Thread {
    private final PrintTable2 pt;

    Table3(PrintTable2 obj) {
        pt = obj;
    }

    public void run() {
        synchronized (pt){
            pt.printTable(2);
        }
    }
}

class Table4 extends Thread {
    private final PrintTable2 pt;

    Table4(PrintTable2 obj) {
        pt = obj;
    }

    public void run() {
        synchronized (pt){
            pt.printTable(10);
        }
    }
}

class PrintTable2 {
    void printTable(int a) {
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