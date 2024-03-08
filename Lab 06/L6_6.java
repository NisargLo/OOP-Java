// Demonstrate the use of Super Keyword.

import java.util.Scanner;

public class L6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal a=new Animal();
        System.out.println("\nEnter age of Animal :");
        byte age=sc.nextByte();
        System.out.println("Enter No. of legs of Animal :");
        byte legs=sc.nextByte();
        System.out.println("Enter type of Animal :");
        String type=sc.next();
        System.out.println("Enter color of Animal :");
        String color=sc.next();
        Tiger t=new Tiger(age, legs, type, color);
        t.display();
    }
}

class Animal{
    int legs;
    int age;
    Animal(){
        legs=4;
        age=10;
        System.out.println("\n* Default Constructor Animal");
    }

    Animal(int legs){
        this.legs=legs;
        System.out.println("\n* Paramiterised Constructor Animal");
    }

    protected void display(){
        System.out.println("\n* Paramiterised Method Animal :-");
        System.out.println("Age of Animal - "+this.age);
        System.out.println("No. of Legs of Animal - "+this.legs);
    }
}

class Tiger extends Animal{
    String type_of_animal=new String();
    String color=new String();
    Tiger(){
        type_of_animal="Herbivore";
        color="Brown Color";
        System.out.println("\n* Default Constructor Tiger");
    }

    Tiger(int age, int legs, String type_of_animal, String color){
        super(legs);
        super.age=age;
        this.type_of_animal=type_of_animal;
        this.color=color;
        System.out.println("\n* Paramiterised Constructor Tiger");
    }

    protected void display(){
        super.display();
        System.out.println("\n* Paramiterised Method Tiger :-");
        System.out.println("Type of Animal - "+this.type_of_animal);
        System.out.println("Color of Animal - "+this.color);
    }
}