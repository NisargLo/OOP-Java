//Define Time class with constructor to initialize hour and minute. Also de ne addition method to add two time objects.

import java.util.Scanner;

public class L5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Hours :");
        int h1=sc.nextInt();
        System.out.println("Enter Minutes :");
        int m1=sc.nextInt();
        System.out.println("Enter Seconds :");
        int s1=sc.nextInt();
        System.out.println("Enter Hours :");
        int h2=sc.nextInt();
        System.out.println("Enter Minutes :");
        int m2=sc.nextInt();
        System.out.println("Enter Seconds :");
        int s2=sc.nextInt();
        Time t1 = new Time(h1,m1,s1);
        Time t2 = new Time(h2,m2,s2);
        Time sum = t1.add(t2);

        
        sc.close();
    }
}
