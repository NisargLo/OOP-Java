//Write a program that creates and initializes a four integer element array. Calculate and display the average of its values.

import java.util.Scanner;

public class L4_3 {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int[] a = new int[4];
     int s=0;
     float av;
     for(int i=0;i<a.length;i++){
          System.out.println("Enter NO. "+(i+1));
          a[i] = sc.nextInt();
          s = s + a[i];
     }
     av = (float)s/4;
     System.out.println("Average = "+av);
     }
}