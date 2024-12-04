// Credit Calculator (Sem-2)

import java.util.Scanner;

class Scan_Credit {
     byte[] credit=new byte[5];
     public Scan_Credit(){
          Scanner sc=new Scanner(System.in);
          for(byte i=0;i<5;i++){
               if(i==0){
                    System.out.println("\nEnter Maths Marks :");
               }
               else if(i==1){
                    System.out.println("\nEnter OOPJ Marks :");
               }
               else if(i==2){
                    System.out.println("\nEnter WD Marks :");
               }
               else if(i==3){
                    System.out.println("\nEnter EG Marks :");
               }
               else if(i==4){
                    System.out.println("\nEnter English Marks :");
               }
               credit[i]=sc.nextByte();
               if(credit[i]>=27){
                    credit[i]=10;
               }
               else if(credit[i]>=24){
                    credit[i]=9;
               }
               else if(credit[i]>=21){
                    credit[i]=8;
               }
               else if(credit[i]>=18){
                    credit[i]=7;
               }
               else if(credit[i]>=15){
                    credit[i]=6;
               }
               else if(credit[i]>=12){
                    credit[i]=5;
               }
               else if(credit[i]>=9){
                    credit[i]=4;
               }
               else if(credit[i]>=6){
                    credit[i]=3;
               }
               else if(credit[i]>=3){
                    credit[i]=2;
               }
          }
          sc.close();
     }
}
public class Credit_Calc{
     public static void main(String[] args) {
          double d=0;
          Scanner sc=new Scanner(System.in);
               Scan_Credit cr=new Scan_Credit();
               for(byte i=0;i<5;i++){
                    if(i==0){
                         d=d+cr.credit[i]*6;
                    }
                    else if(i==1 || i==2){
                         d=d+cr.credit[i]*5;
                    }
                    else if(i==3 || i==4){
                         d=d+cr.credit[i]*4;
                    }
               }
               d/=24;
               System.out.println("\n\nCredit = "+d);
          sc.close();
     }
}