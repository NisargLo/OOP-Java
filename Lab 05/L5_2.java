//Define Time class with constructor to initialize hour, minute & second. Also define addition method to add two time objects.

import java.util.Scanner;

public class L5_2 {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          Time t1=new Time();
          Time t2=new Time();
          System.out.println("\nEnter Hour 1 :");
          t1.h=sc.nextInt();
          System.out.println("Enter Minute 1 :");
          t1.m=sc.nextInt();
          System.out.println("Enter Second 1 :");
          t1.s=sc.nextInt();
          System.out.println("\nEnter Hour 2 :");
          t2.h=sc.nextInt();
          System.out.println("Enter Minute 2 :");
          t2.m=sc.nextInt();
          System.out.println("Enter Second 2 :");
          t2.s=sc.nextInt();
          Time t3=new Time();
          t3.addition(t1,t2);
          System.out.println("\nTime Addition Ans. = "+t3.h+" : "+t3.m+" : "+t3.s);
          sc.close();
     }
}

class Time{
     int h,m,s;
     public Time(){
          this.h=0;
          this.m=0;
          this.s=0;
     }
     public void addition(Time t1,Time t2){
          s=t1.s+t2.s;
          m=t1.m+t2.m;
          h=t1.h+t2.h;
          while(s>60){
               s-=60;
               m+=1;
          }
          while(m>60){
               m-=60;
               h+=1;
          }
     }
}