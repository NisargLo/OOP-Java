/*
    Create a class called Student.
    Write a student manager program to manipulate the student information from files by using FileInputStream and FileOutputStream.
 */

import java.io.*;
import java.util.Scanner;

public class L10_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File fi = new File("Student_Input.txt");
            File fo = new File("Student_Output.txt");
            fo.createNewFile();
            FileInputStream fis = new FileInputStream(fi);
            FileOutputStream fos = new FileOutputStream(fo);
            int c;

            System.out.println("\nData transferred from input file to output file.\n");
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
                fos.write(c);
            }
            fis.close();
            fos.write('\n');
            fos.write('\n');

            System.out.println("\n\nHow many students are there?");
            int n = sc.nextInt();
            Student1[] s = new Student1[n];
            for (int i = 0; i < s.length; i++) {
                System.out.println("\nStudent " + (i + 1));
                System.out.println("Enter name :");
                String name = sc.next();
                System.out.println("Enter rollNo :");
                short rollNo = sc.nextShort();
                System.out.println("Enter age :");
                byte age = sc.nextByte();
                s[i] = new Student1(name, rollNo, age);
            }

            System.out.println("\nData transfered from terminal to output file.");
            for (Student1 stu : s) {
                String studentInfo = stu.name + " ," + stu.rollNo + " ," + stu.age + "\n";
                fos.write(studentInfo.getBytes());
            }
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student1 { // Name of class is 'Student1' as there is already a class called 'Student' in the project.
    String name;
    short rollNo;
    byte age;

    Student1(String name, short rollNo, byte age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
}