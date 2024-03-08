// 1st order Runge Kutta Method   or   Euler's Method

import java.util.Scanner;

public class RK_1 {
     private double func(double x,double y){
          // Write your function below :-
          return (y-x)/(y+x) ;
     }

     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("\nImportant Note : Write your function in 8th line of Java-Code after keyword 'return' and before ';'");
          System.out.println("\nEnter h :");
          double h=sc.nextDouble();

          System.out.println("\nEnter x[0] :");
          double z=sc.nextDouble();

          System.out.println("\nEnter x[n] :");
          double an=sc.nextDouble();

          double n1=(an-z)/h;
          int n2=(int)Math.round(n1);

          double[] x=new double[n2+2];
          x[0]=z;
          x[n2]=an;

          double[] y=new double[n2+2];
          System.out.println("\nEnter y[0] :");
          y[0]=sc.nextDouble();

          RK_1 rk=new RK_1();

          for(byte i=0;i<(x.length-2);i++){
               x[i+1]=x[i]+h;
               y[i+1]=y[i]+h*(rk.func(x[i],y[i]));
               System.out.println("\nStep : "+(i+1));
               if((i+1)!=n2){
                    System.out.printf("y(%.2f) = %.5f",x[i+1],y[i+1]);
                    System.out.println();
               }
               else{
                    System.out.printf("Final Answer : y(%.2f) = %.5f",x[n2],y[n2]);
                    System.out.println("\n");
               }
          }
          sc.close();
     }
}

// By - Nisarg Lo