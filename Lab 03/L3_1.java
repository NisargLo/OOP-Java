/*
   The marks obtained by a student in 5 different subjects are input through the keyboard. 
   The student gets a division as per the following rules:
      I. Percentage above or equals to 60-first division
      II. Percentage between 50 to 59-second division
      III. Percentage between 40 and 49-Third division
      IV. Percentage less than 40-fail
 */

import java.util.Scanner;

public class L3_1{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      float a,b,c,d,e;
      do{
         System.out.println("\nEnter marks of Sub-1 : ");
         a=sc.nextFloat();
      }while(a<=0 || a>=100);
      do {
         System.out.println("\nEnter marks of Sub-2 : ");
         b=sc.nextFloat();
      }while (b<=0 || b>=100);
      do {
         System.out.println("\nEnter marks of Sub-3 : ");
         c=sc.nextFloat();
      }while (c<=0 || c>=100);
      do {
         System.out.println("\nEnter marks of Sub-4 : ");
         d=sc.nextFloat();
      }while (d<=0 || d>=100);
      do {
         System.out.println("\nEnter marks of Sub-5 : ");
         e=sc.nextFloat();
      }while (e<=0 || e>=100);
      double f=(a+b+c+d+e)/5.0;
      if(f>=60){
         System.out.println("\nPercentage = "+f+" \nFirst Division");
      }
      else if(f>=50 && f<=59){
         System.out.println("\nPercentage = "+f+" \nSecond Division");
      }
      else if(f>=40 && f<=49){
         System.out.println("\nPercentage = "+f+" \nThird Division");
      }
      else if(f<40){
         System.out.println("\nPercentage = "+f+" \nFail");
      }
      sc.close();
   } 
}