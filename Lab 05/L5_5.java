/*  Define class for Complex number with real and imaginary as data members. 
      Create its contructor, overload the constructors.
      Also define addition method to add two complex objects.
*/

import java.util.Scanner;

public class L5_5 {
    public static void main(String[] args) {
        double real,imaginary;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Real No. :");
        real=sc.nextDouble();
        System.out.println("\nEnter Imaginary No. :");
        imaginary=sc.nextDouble();

        Complex_Number cno1=new Complex_Number(real);
        Complex_Number cno2=new Complex_Number(real, imaginary);
        cno2.Addition(real, imaginary);
    }
}

class Complex_Number{
    double real,imaginary;
    protected Complex_Number(double real){
        this.real=real;
        System.out.println("\nReal No. = "+real);
    }

    protected Complex_Number(double real, double imaginary){
        this.imaginary=imaginary;
        System.out.println("\nImaginary No. (Overloaded Constructor) = "+imaginary+" * i");
    }
    protected void Addition(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
        System.out.println("\nAddition Answer = "+real+" + "+imaginary+" * i");
    }
}