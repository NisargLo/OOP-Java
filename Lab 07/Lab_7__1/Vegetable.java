package Lab_7__1;

abstract class Vegetable{
    String name;
    String color;
    protected abstract void display();
    protected abstract String getName();

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

    protected void display(){
        System.out.println("\nName of Vegetable - "+super.name);
        System.out.println("Color of Vegetable - "+super.color);
    }

    protected String getName() {
        return "Potato";
    }

}

class Brinjal extends Vegetable{
    Brinjal(String name, String color){
        super(name, color);
    }

    protected void display(){
        System.out.println("\nName of Vegetable - "+super.name);
        System.out.println("Color of Vegetable - "+super.color);
    }

    protected String getName() {
        return "Brinjal";
    }

}

class Tomato extends Vegetable{
    Tomato(String name, String color){
        super(name, color);
    }

    protected void display(){
        System.out.println("\nName of Vegetable - "+super.name);
        System.out.println("Color of Vegetable - "+super.color);
    }

    protected String getName() {
        return "Tomato";
    }
}