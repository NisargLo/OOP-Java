/*
    Refine the student manager program to manipulate the student information from files by using the DataInputStream and DataOutputStream.
    Assume suitable data.
 */

import java.io.*;

public class L11_4 {
    public static void main(String[] args) {
        try{
            File fi=new File("Input.txt");
            File fo=new File("Output.txt");
            fo.createNewFile();
            DataInputStream dis=new DataInputStream(new FileInputStream(fi));
            DataOutputStream dos=new DataOutputStream(new FileOutputStream(fo));
            byte[] b1 = new byte[1];
            int readBytes;
            while((readBytes=dis.read(b1))!=-1) {
                dos.write(b1);
            }
            System.out.println("\nData transferred from input file to output file (Method 1).");

            byte[] b2=new byte[1024];
            while((readBytes=dis.read(b2))!=-1) {
                dos.write(b2,0,readBytes);
            }
            System.out.println("\nData transferred from input file to output file (Method 2).");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

