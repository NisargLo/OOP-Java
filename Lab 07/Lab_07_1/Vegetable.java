package Lab_07_1;

abstract class Vegetable{
    protected String name;
    protected String color;
    abstract void display();
    public abstract String getName();

    Vegetable(String name, String color){
        this.color=color;
        this.name=name;
    }

    public String toString(){
        return "Name of Vegetable - "+getName()+", Color of Vegetable - "+color;
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

    public String getName() {
        return "Potato";
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

    public String getName() {
        return "Brinjal";
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

    public String getName() {
        return "Tomato";
    }
}