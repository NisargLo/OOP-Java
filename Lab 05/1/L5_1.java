//Write a program to create circle class with area function to nd area of circle

import java.util.Scanner;

public class L5_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Enter Radius :");
        double r=sc.nextFloat();
        double ans=c1.area(r);
        System.out.println("Area of Circle = "+ans);
        sc.close();
    }
}