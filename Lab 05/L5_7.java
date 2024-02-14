//Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not.

import java.util.Scanner;

public class L5_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter NO. (which is stored in static variable) :");
        int n=sc.nextInt();
        Check c1=new Check();
        c1.thisN1(n);
        c1.printN();
        sc.close();
    }
}

class Check{
    static int n;
    public void thisN1(int n){
        this.n=n;
    }

    public void printN(){
        System.out.println("\nYour No. N = "+n+"\nHence, 'this' keyword can access static variables of class.");
    }
}