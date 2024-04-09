/*
    Declare a class called student having the following data members: id_no, no_of_sub, sub_code, sub_credits, grade and spi.
    Define constructor and calculateSPI methods.
    Define main to instantiate an array for objects of class student to process data of n students to be given as command line arguments.
*/

import java.util.Scanner;

public class L6_1 {
    static short i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        System.out.println("\nNO. of Students = " + n);
        Student[] s = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " :-");
            System.out.println("Enter ID No. :");
            int id_no = sc.nextInt();
            System.out.println("Enter No. of Subjects :");
            int no_of_sub = sc.nextInt();
            s[i] = new Student(id_no, no_of_sub);
        }
        for (i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + " :-");
            s[i].getNoOfSub();
            s[i].spi = s[i].calculateSPI();
        }
        for (i = 0; i < n; i++) {
            System.out.print("\nStudent " + (i + 1) + ", ID No. - " + s[i].id_no);
            System.out.print("\nStudent " + (i + 1) + ", No. of Subjects - " + s[i].no_of_sub);
            System.out.print("\nStudent " + (i + 1) + ", SPI - " + s[i].spi + "\n");
        }
    }
}

class Student {
    static short i;
    int id_no;
    int no_of_sub;
    String[] sub_code;
    int[] sub_credits;
    String[] grade;
    double spi;
    double marks;
    double total_credits;

    Student(int id_no, int no_of_sub) {
        this.id_no = id_no;
        this.no_of_sub = no_of_sub;
        this.sub_code = new String[no_of_sub];
        this.sub_credits = new int[no_of_sub];
        this.grade = new String[no_of_sub];
    }

    protected void getNoOfSub() {
        Scanner sc = new Scanner(System.in);
        total_credits = 0;
        for (i = 0; i < no_of_sub; i++) {
            System.out.println("Subject " + (i + 1) + " Code :");
            sub_code[i] = sc.next();
            System.out.println("Credit of Subject " + (i + 1) + " :");
            sub_credits[i] = sc.nextInt();
            System.out.println("Enter Grade of Subject " + (i + 1) + " :");
            grade[i] = sc.next();
            total_credits += sub_credits[i];
        }
    }

    protected double calculateSPI() {
        marks = 0;
        for (i = 0; i < no_of_sub; i++) {
            if (grade[i].equalsIgnoreCase("A++") || grade[i].equalsIgnoreCase("O")) {
                marks += 10 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("A+")) {
                marks += 9 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("A")) {
                marks += 8 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("B+")) {
                marks += 7 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("B")) {
                marks += 6 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("C+")) {
                marks += 5 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("C")) {
                marks += 4 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("D+")) {
                marks += 3 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("D")) {
                marks += 2 * sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("E+")) {
                marks += sub_credits[i];
            } else if (grade[i].equalsIgnoreCase("E")) {
                marks += 0;
            }
        }
        spi = marks / total_credits;
        return spi;
    }
}