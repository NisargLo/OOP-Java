//Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not.

import java.util.Scanner;

public class L5_7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter NO. (which is stored in static variable) :");
        int n=sc.nextInt();
        Check c1=new Check();
        c1.thisN(n);
        c1.printN();
        sc.close();
    }
}

class Check{
    int n;
    protected void thisN(int n){
        this.n=n;
    }

    protected void printN(){
        System.out.println("\nYour No. = "+n+"\nHence, 'this' keyword can access 'static' variables of class.\nBut 'this' keyword can't access variables of class if method is 'static'.");
    }
}