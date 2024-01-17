//Write a program to nd that given number or string is palindrome or not.

import java.util.Scanner;

public class L3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter NO. 1 :");
        int a = sc.nextInt();
        System.out.println("\nEnter NO. 2 :");
        int b = sc.nextInt(); 
        System.out.println("\nEnter NO. 3 :");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("\n"+a+" is Max.");
        }
        if(b>a && b>c){
            System.out.println("\n"+b+" is Max.");
        }
        if(c>a && c>b){
            System.out.println("\n"+c+" is Max.");
        }

        //Using nested if :
        if(a>b){
            if(a>c){
                System.out.println("\n"+a+" is Max.");
            }
            else{
                System.out.println("\n"+c+" is Max.");
            }
        }
        else{
            if(b>c){
                System.out.println("\n"+b+" is Max.");
            }
           else{
                System.out.println("\n"+c+" is Max.");
            }
        }
        int max;
        max=(a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
        System.out.println("\n"+max+" is Max. (Ternary)");
        sc.close();
    }
}