import java.util.Scanner;

class Scan_DifferentMethods {
     static int n,i;
     static double d;
     static{
          Scanner sc=new Scanner(System.in);
          System.out.println("\nHow many values of 'X' & 'Y' will you enter :");
          n=sc.nextInt();
          System.out.println("\nEnter value of 'X' at which you want to find 'Y' :");
          d=sc.nextDouble();
     }
     double[] x=new double[n];
     double[] y=new double[n];
     public Scan_DifferentMethods(){
          Scanner sc=new Scanner(System.in);
          for(i=0;i<x.length;i++){
               System.out.println("\nEnter X ( "+(i+1)+" ) :");
               x[i]=sc.nextDouble();
          }
          for(i=0;i<y.length;i++){
               System.out.println("\nEnter Y ( "+(i+1)+" ) :");
               y[i]=sc.nextDouble();
          }
          
     }
     public int factorial(int x){
          byte i;
          int m1=1;
          for(i=1;i<=x;i++){
               m1=m1*i;
          }
          return m1;
     }
     public double p_Minus(double a, int b){
          double m2=1;
          int i;
          for(i=0;i<=(b-1);i++){
               m2=m2*(a-i);
          }
          return m2;
     }
     public double p_Plus(double a, int b){
          double m2=1;
          for(int i=0;i<=(b-1);i++){
               m2=m2*(a+i);
          }
          return m2;
     }
}