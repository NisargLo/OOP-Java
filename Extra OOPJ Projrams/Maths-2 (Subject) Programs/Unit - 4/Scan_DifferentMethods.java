//Scan values of X & Y, and methods which are useful for Unit-4

import java.util.Scanner;

public class Scan_DifferentMethods {
     static int n;
     int m1,t1,t2,i;
     double m2,d;
     static{
          Scanner sc=new Scanner(System.in);
          System.out.println("\nHow many values of 'X' & 'Y' will you enter :");
          n=sc.nextInt();
     }
     double[] x=new double[n];
     double[] y=new double[n];
     protected Scan_DifferentMethods(){
          Scanner sc=new Scanner(System.in);
          for(i=0;i<x.length;i++){
               System.out.println("\nEnter X ( "+(i+1)+" ) :");
               x[i]=sc.nextDouble();
          }
          for(i=0;i<y.length;i++){
               System.out.println("\nEnter Y ( "+(i+1)+" ) :");
               y[i]=sc.nextDouble();
          }
          System.out.println("\nEnter value of 'X' at which you want to find 'Y' :");
          d=sc.nextDouble();
     }
     protected int factorial(int x){
          m1=1;
          for(i=1;i<=x;i++){
               m1*=i;
          }
          return m1;
     }
     protected double p_Minus(double p, int b){
          m2=1;
          for(i=0;i<b;i++){
               m2*=(p-i);
          }
          return m2;
     }
     protected double p_Plus(double p, int b){
          m2=1;
          for(i=0;i<b;i++){
               m2*=(p+i);
          }
          return m2;
     }
     protected double p_Minus_Plus(double p, int b){
          t1=t2=0;
          m2=1;
          for(i=0;i<b;i++){
               if(i%2==0){
                    if(i>0){
                         t1++;
                    }
                    m2*=(p+t1);
               }
               else{
                    t2=~t1;
                    m2*=(p+t2);
               }
          }
          return m2;
     }
     protected double p_Plus_Minus(double p, int b){
          t1=t2=0;
          m2=1;
          for(i=0;i<b;i++){
               if(i%2!=0){
                    t1++;
                    m2*=(p+t1);
               }
               else{
                    t2=~t1;
                    t2++;
                    m2*=(p+t2);
               }
          }
          return m2;
     }
}