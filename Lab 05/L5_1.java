//Write a program to create circle class with area function to find area of circle.

import java.util.Scanner;

class Circle{
    int r;
    public double Area(){
        return Math.PI*r*r;
    }
}
public class L5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius :");
        int r=sc.nextInt();
        Circle c=new Circle();
        c.r=r;
        double a=c.Area();
        System.out.println("\nArea = "+a);
        sc.close();
    }
}