//Write a program to check that the given number is prime or not

import java.util.Scanner;

public class L3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NO. : ");
        int f=0,n = sc.nextInt();
        for(int i=2;i<=(n/2);i++){
            if(n%i==0){
                f=1;
            } 
        }
        if(f==0){
            System.out.println("\nPrime");
        }
        else{
            System.out.println("\nNot Prime");
        }
    }
}