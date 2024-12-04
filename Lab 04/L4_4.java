//Write a program to print given array in reverse order.

import java.util.Scanner;

public class L4_4 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n;
          System.out.println("Enter N :");
          n = sc.nextInt();
          int[] a = new int[n];
          for(int i=0;i<a.length;i++){
               System.out.println("Enter NO. "+(i+1));
               a[i] = sc.nextInt();
          }
          System.out.println();
          for(int i=a.length-1;i>=0;i--){
               System.out.println("Your NO. "+(i+1)+" - "+a[i]);
          }
          sc.close();
     }
}