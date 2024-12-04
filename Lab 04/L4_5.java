//Write a program to find length of string and print second half of the string.

import java.util.Scanner;

public class L4_5 {
     public static void main(String[] args) {
          int l,i;
          Scanner sc = new Scanner(System.in);
          System.out.println("\nEnter String :");
          String s = sc.nextLine();
          l = s.length();
          System.out.println("\nLenght = "+l);
          System.out.print("\nSeccond half of String - ");
          for(i=s.length()/2;i<s.length();i++){
               System.out.print(s.charAt(i));
          }
          sc.close();
     }
}