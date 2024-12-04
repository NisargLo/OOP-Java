/*
    Type - 2 (using toString() method)
    The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato.
    Write a java program that demonstrates how to establish this class hierarchy.
    Declare one instance variable of type String that indicates the color of a vegetable.
    Create and display instances of these objects.
    Override the toString() method of object to return a string with the name of vegetable and its color.
 */

package Lab_7__1;
import java.util.Scanner;

public class L7_1_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter color of Potato :");
        String po=sc.nextLine();
        System.out.println("\nEnter color of Brinjal :");
        String br=sc.nextLine();
        System.out.println("\nEnter color of Tomato :");
        String to=sc.nextLine();
        System.out.println();
        Potato p=new Potato("Potato", po);
        Brinjal b=new Brinjal("Brinjal", br);
        Tomato t=new Tomato("Tomato", to);
        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
        sc.close();
    }
}