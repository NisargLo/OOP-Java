/*
    Write a program that illustrates interface inheritance. 
    Interface A is extended by A1 and A2. 
    Interface A12 inherits from both A1 and A2.
    Each interface declares one constant and one method. 
    Class B implements A12.
    Instantiate B and invoke each of its methods. 
    Each method displays one of the constants.
 */

public class L7_2 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println("\nAll methods with their respective constants :-\n");
        b.printA();
        b.printA1();
        b.printA2();
        b.printA12();
    }
}

interface A {
    int A=10;
    void printA();
}

interface A1 extends A {
    int A1=11;
    void printA1();
}

interface A2 extends A {
    int A2=22;
    void printA2();
}

interface A12 extends A1, A2 {
    int A12=33;
    void printA12();
}

class B implements A12 {
    public void printA(){
        System.out.println("A = "+A);
    }

    public void printA1(){
        System.out.println("A1 = "+A1);
    }
    
    public void printA2(){
        System.out.println("A2 = "+A2);
    }

    public void printA12(){
        System.out.println("A12 = "+A12);
    }
}