/*
    Create a class named 'Member' having the following members:
    1. Name
    2. Age
    3. Phone Number
    4. Address
    5. Salary
    It also has a method named 'printSalary' which prints the salary of the members.
    Two classes 'Employee' and Manager' inherits the 'Member' class.
    The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
    Now assign name, age, phone number address and salary to an employee and a manager by making an object of both of these classes and print the same along with specialization and department respectively.
 */

import java.util.Scanner;

public class L6_3 {
    public static void main(String[] args) {
        Member m=new Member();
    }
}

class Member{
    String name;
    byte age;
    int phone_number;
    String address;
    int salary;

    Member(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Name :");
        this.name=sc.next();
        System.out.println("Enter Age :");
        this.age=sc.nextByte();
        System.out.println("");

    }

    public void printSalary(){
        System.out.println("\nSalary - "+salary);
    }
}

class Employee extends Member{
    String specialization;
    String department;
}

class Manager extends Member{

}