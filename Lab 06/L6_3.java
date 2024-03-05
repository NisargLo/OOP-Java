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
        Member me=new Member();
        Employee e=new Employee();
        Manager ma=new Manager();
        e.printDetails();
        ma.printDetails();
    }
}

class Member{
    String name;
    byte age;
    int phone_number;
    String address;
    int salary;

    public void scanDetails(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter Name :");
        this.name=sc.nextLine();
        System.out.println("Enter Age :");
        this.age=sc.nextByte();
        System.out.println("Enter Phone Number :");
        this.phone_number=sc.nextInt();
                          sc.nextLine();
        System.out.println("Enter Address :");
        this.address=sc.nextLine();
        System.out.println("Enter Salary :");
        this.salary=sc.nextInt();
    }

    public void printSalary(){
        System.out.println("\nName - "+name);
        System.out.println("Age - "+age);
        System.out.println("Phone Number - "+phone_number);
        System.out.println("Address - "+address);
        System.out.println("Salary - "+salary);
    }
}

class Employee extends Member{
    String specialization;
    String department;

    Employee(){
        System.out.println("\nEmployee :-");
        super.scanDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Specialization :");
        this.specialization=sc.nextLine();
        System.out.println("Enter Department :");
        this.department=sc.nextLine();
    }

    public void printDetails(){
        System.out.println("\nEmployee :-");
        super.printSalary();
        System.out.println("Specialization - "+specialization);
        System.out.println("Department - "+department);
    }
}

class Manager extends Member{
    String specialization;/*
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
            Member me=new Member();
            Employee e=new Employee();
            Manager ma=new Manager();
            e.printDetails();
            ma.printDetails();
        }
    }

    class Member{
        String name;
        byte age;
        int phone_number;
        String address;
        int salary;

        public void scanDetails(){
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter Name :");
            this.name=sc.nextLine();
            System.out.println("Enter Age :");
            this.age=sc.nextByte();
            System.out.println("Enter Phone Number :");
            this.phone_number=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Address :");
            this.address=sc.nextLine();
            System.out.println("Enter Salary :");
            this.salary=sc.nextInt();
        }

        public void printSalary(){
            System.out.println("\nName - "+name);
            System.out.println("Age - "+age);
            System.out.println("Phone Number - "+phone_number);
            System.out.println("Address - "+address);
            System.out.println("Salary - "+salary);
        }
    }

    class Employee extends Member {
        String specialization;
        String department;

        Employee(){
            System.out.println("\nEmployee :-");
            super.scanDetails();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Specialization :");
            this.specialization=sc.nextLine();
            System.out.println("Enter Department :");
            this.department=sc.nextLine();
        }

        public void printDetails(){
            System.out.println("\nEmployee :-");
            super.printSalary();
            System.out.println("Specialization - "+specialization);
            System.out.println("Department - "+department);
        }
    }

    class Manager extends Member {
        String specialization;
        String department;

        Manager(){
            System.out.println("\nManager :-");
            super.scanDetails();
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Specialization :");
            this.specialization=sc.nextLine();
            System.out.println("Enter Department :");
            this.department=sc.nextLine();
        }

        public void printDetails(){
            System.out.println("\nManager :-");
            super.printSalary();
            System.out.println("Specialization - "+specialization);
            System.out.println("Department - "+department);
        }
    }
    String department;

    Manager(){
        System.out.println("\nManager :-");
        super.scanDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Specialization :");
        this.specialization=sc.nextLine();
        System.out.println("Enter Department :");
        this.department=sc.nextLine();
    }

    public void printDetails(){
        System.out.println("\nManager :-");
        super.printSalary();
        System.out.println("Specialization - "+specialization);
        System.out.println("Department - "+department);
    }
}