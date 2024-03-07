/*
    Declare a class called Book having author_name as private data member. 
    Extend book class to have two sub classes called Book_Publication & Paper_Publication. 
    Each of these classes have private member called title. Write a complete program to show usage of dynamic method dispatch (dynamic polymorphism) to display book or paper publications of given author.
    Use command line arguments for inputting data.
 */

import java.util.Scanner;

public class L6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book b=new Book();
        Book_Publication b1=new Book_Publication();
        Paper_Publication b2=new Paper_Publication();
        System.out.println("\nEnter Book or Paper :");
        String X=sc.next();
        if(X.equalsIgnoreCase("Book")){
            b=b1;
        }
        else if(X.equalsIgnoreCase("Paper")){
            b=b2;
        }
        b.display();
    }
}

class Book{
    private final String author_name;
    public Book(){
        this.author_name="Nisarg Lo";
    }
    public void display(){
        System.out.println("\nAuthor Name - "+this.author_name);
    }
}

class  Book_Publication extends Book {
    private final String title;
    Book_Publication(){
        this.title="ABCDE";
    }
    public void display(){
        System.out.println("\nDisplay : Book Publication - "+this.title);
    }
}

class Paper_Publication extends Book {
    private final String title;
    Paper_Publication(){
        this.title="VWXYZ";
    }
    public void display(){
        System.out.println("\nDisplay : Paper Publication - "+this.title);
    }
}