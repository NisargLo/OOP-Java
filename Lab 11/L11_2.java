/*
    Write a program to check that whether the name given from command line is file or not?
    If it is a file, then print the size of the file and if it is a directory, then it should display the name of all files in it.
 */

import java.io.*;

public class L11_2 {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = args[0];
        File f = new File(fileName);
        if (f.exists()) {
            if(f.isFile()){
                System.out.println("\nIs file \nfile size : "+f.length()+" bytes");
            }
            else if(f.isDirectory()){
                System.out.println("\nIs directory \n\nlist of files in directory :-");
                String[] fileNames=f.list();
                assert fileNames != null;
                for(String fn : fileNames){
                    System.out.println(fn);
                }
            }
        }
        else{
            throw new FileNotFoundException("\nIs neither file nor directory.");
        }
    }
}
