import java.util.Scanner;

public class L3_1{
   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("\nEnter marks of Sub-1 : ");
      float a=sc.nextFloat();
      System.out.println("\nEnter marks of Sub-2 : ");
      float b=sc.nextFloat();
      System.out.println("\nEnter marks of Sub-3 : ");
      float c=sc.nextFloat();
      System.out.println("\nEnter marks of Sub-4 : ");
      float d=sc.nextFloat();
      System.out.println("\nEnter marks of Sub-5 : ");
      float e=sc.nextFloat();
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
   } 
}