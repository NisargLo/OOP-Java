//Write a java program to do sum of command line argument passed as two Double numbers

public class L4_1 {
     public static void main(String[] args) {
          double a = Double.parseDouble(args[0]);
          double b = Double.parseDouble(args[1]);
          System.out.println("Sum = "+(a+b));
     }
}