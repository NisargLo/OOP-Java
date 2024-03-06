/*
    The abstract vegetable class has three subclasses named Potato, Brinjal and Tomato. Write a java program that demonstrates how to establish this class hierarchy. Declare one instance variable of type String that indicates the color of a vegetable. Create and display instances of these objects. Override the toString() method of object to return a string with the name of vegetable and its color.
 */

import java.util.Scanner;

abstract class Vegetable{
    protected String name;
    protected String color;
    abstract void display();

    Vegetable(String name, String color){
        this.color=color;
        this.name=name;
    }
}

public class L7_1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter color of Potato :");
        String po=sc.nextLine();
        System.out.println("\nEnter color of Brinjal :");
        String br=sc.nextLine();
        System.out.println("\nEnter color of Tomato :");
        String to=sc.nextLine();
        Potato p=new Potato("Potato", po);
        Brinjal b=new Brinjal("Brinjal", br);
        Tomato t=new Tomato("Tomato", to);
        p.display();
        b.display();
        t.display();
        sc.close();
    }
}

class Potato extends Vegetable{
    Potato(String name, String color){
        super(name, color);
    }

    public void display(){
        System.out.println("\nName of Vegetable - "+super.name);
        System.out.println("Color of Vegetable - "+super.color);
    }
}

class Brinjal extends Vegetable{
    Brinjal(String name, String color){
        super(name, color);
    }
        
    public void display(){
        System.out.println("\nName of Vegetable - "+super.name);
        System.out.println("Color of Vegetable - "+super.color);
    }
}

class Tomato extends Vegetable{
    Tomato(String name, String color){
        super(name, color);
    }
        
    public void display(){
        System.out.println("\nName of Vegetable - "+super.name);
        System.out.println("Color of Vegetable - "+super.color);
    }
}