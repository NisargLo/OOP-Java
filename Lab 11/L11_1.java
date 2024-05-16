/*
    Refine the student manager program to manipulate the student information from files by using the BufferedReader and BufferedWriter.

    In input file, data are as follows which is stored in class Student2, & then printed to output file.
    name1, rollNo1, age1
    name2, rollNo2, age2
    name3, rollNo3, age3
 */

import java.io.*;
import java.util.*;

public class L11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File fi = new File("Student_Input.txt");
            File fo = new File("Student_Output.txt");
            fo.createNewFile();
            BufferedReader br = new BufferedReader(new FileReader(fi));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fo));
            int n=0;
            String line;
            while((line=br.readLine())!=null){
                n++;
            }
            br = new BufferedReader(new FileReader(fi));
            Student2[] s=new Student2[n];
            System.out.println("\nInput file have "+n+" lines.");

            System.out.println("\nData stored from input file to class 'Student2'.\n");
            for(int i=0;br.ready();i++) {
                line = br.readLine();
                String[] str = line.split(",");
                short sho = Short.parseShort(str[1].trim());
                byte byt = Byte.parseByte(str[2].trim());
                s[i] = new Student2(str[0], sho, byt);
            }
            br.close();

            String temp_Str;
            for(int i=0;i<s.length;i++){
                temp_Str = s[i].toString();
                System.out.println(temp_Str);
                bw.write(temp_Str+"\n");
            }
            System.out.println("Then, data is written on output file.");
            bw.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

class Student2{ // Name of class is 'Student2' as there is already a class called 'Student' in the project.
    String name;
    short rollNo;
    byte age;

    Student2(String name, short rollNo, byte age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    public String toString(){
        return name+", "+rollNo+", "+age;
    }
}