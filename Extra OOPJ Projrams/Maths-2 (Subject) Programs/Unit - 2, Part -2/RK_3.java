// 3rd order Runge Kutta Method

import java.util.Scanner;

public class RK_3 {
     public double func(double x,double y){
          // Write your function below :-
          return ((y*y)-(x*x))/((y*y)+(x*x)) ;
     }
     
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          System.out.println("\nImportant Note : Write your function in 8th line of Java-Code after keyword 'return' and before ';'");
          System.out.println("\nEnter h :");
          double h=sc.nextDouble(),k1,k2,k3;

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

          RK_3 rk=new RK_3();
          
          for(byte i=0;i<(x.length-2);i++){
               x[i+1]=x[i]+h;
               k1=h*(rk.func(x[i],y[i]));
               k2=h*(rk.func((x[i]+(h/2)),(y[i]+(k1/2))));
               k3=h*(rk.func((x[i]+h),(y[i]-k1+(2*k2))));
               y[i+1]=y[i]+(k1+(4*k2)+k3)/6;
               System.out.println("\nStep : "+(i+1));
               System.out.printf("K1 = %.4f",k1);
               System.out.println();
               System.out.printf("K2 = %.4f",k2);
               System.out.println();
               System.out.printf("K3 = %.4f",k3);
               System.out.println();
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