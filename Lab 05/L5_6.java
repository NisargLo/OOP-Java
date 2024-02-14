//WAP that counts the number of objects created using static.

import java.util.Scanner;

public class L5_6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nHow many times do you want to create new Object of Class Object_Count :");
        int n=sc.nextInt();
        Object_Count[] c=new Object_Count[n];
        for(int i=0;i<n;i++){
            c[i] = new Object_Count();
        }
        System.out.println("Object created "+Object_Count.c+" times.");
        sc.close();
    }
}

class Object_Count{
    static int c=0;
    public Object_Count(){
        c++;
    }
}