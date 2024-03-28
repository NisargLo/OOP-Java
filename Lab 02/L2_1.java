// Write a program to get 2 numbers from the user and print the sum of two numbers using command line and Scanner class.

import java.util.Scanner;

public class L2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=Integer.parseInt(args[0]),b;
        System.out.println("\nEnter No. 2 :");
        b=sc.nextInt();
        System.out.println("\nYour No. 1 = "+a+"\nYour No. 2 = "+b);
    }
}
