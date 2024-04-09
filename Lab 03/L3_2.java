// Write a program to nd that given number or string is palindrome or not.

import java.util.Scanner;

public class L3_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter String :");
        String s = sc.nextLine();
        int start = 0,x=1;
        int end = s.length()-1;

    //Using While Loop
        while(start!=end){
            if(s.charAt(start)!=s.charAt(end)){
                x=0;
                break;
            }
            start++;
            end--;
        }
        if(x==0){
            System.out.println("\nNot Palindrome (While Loop)");
        }
        else{
            System.out.println("\nPalindrome (While Loop)");
        }

    //Using For Loop
        for(start=0,x=1,end=s.length()-1;start<=(s.length()/2);start++,end--){
            if(s.charAt(start)!=s.charAt(end)){
                x=0;
                break;
            }
        }
        if(x==0){
            System.out.println("Not Palindrome (For Loop)");
        }
        else{
            System.out.println("Palindrome (For Loop)");
        }
        sc.close();
    }
}