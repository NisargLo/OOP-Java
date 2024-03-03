//Write a program to create circle class with area function to find area of circle.

package Lab_05_1;
import java.util.Scanner;

public class L5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Radius :");
        double r=sc.nextInt();
        Circle c=new Circle();
        double a=c.Area(r);
        System.out.println("\nArea = "+a);
        sc.close();
    }
}