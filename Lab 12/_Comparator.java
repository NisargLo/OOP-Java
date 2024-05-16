/*
    Demonstrate the use of Collection Framework in Java.
    (Comparator)
 */

import java.util.*;

class Student {
    final int rollno;
    final String name, address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return (this.rollno + " " + this.name + " " + this.address);
    }
}

class SortByRoll implements Comparator<Student> {
    public int compare(Student a, Student b) {
        System.out.println("Roll No. A - "+a.rollno+" , Roll No. B - "+b.rollno);
        return a.rollno - b.rollno;
    }
}

class SortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

class SortByAddress implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.address.compareTo(b.address);
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        Student s1=new Student(110, "Nisarg", "California");
        students.add(s1);
        students.add(new Student(111, "Mayank", "London"));
        students.add(new Student(131, "Anshul", "NYC"));
        students.add(new Student(121, "Solanki", "Jaipur"));
        students.add(new Student(101, "Aggarwal", "Hong Kong"));
        System.out.println("Unsorted:");
        for (Student student : students)
            System.out.println(student);
        students.sort(new SortByRoll());
        System.out.println("\nSorted by roll number:");
        for (Student student : students)
            System.out.println(student);
        Collections.sort(students, new SortByName());
        System.out.println("\nSorted by name:");
        for (Student student : students)
            System.out.println(student);
        Collections.sort(students, new SortByAddress());
        System.out.println("\nSorted by address:");
        for (Student student : students)
            System.out.println(student);
    }
}
