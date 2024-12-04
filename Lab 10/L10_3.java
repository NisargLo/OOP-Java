/*
    Write an application that reads a file and counts the number of occurrences of digit 5.
    Supply the file name as a command-line argument.
 */

import java.util.*;
import java.io.*;

public class L10_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String filename = args[0];
        int count = 0;
        try {
            File f=new File(filename);
            if (!f.exists()) {
                throw new FileNotFoundException("\nFile not found.");
            }
            System.out.println("\nWhich character do you want to count in file : ");
            char c=sc.next().charAt(0);
            BufferedReader br=new BufferedReader(new FileReader(f));
            String line = br.readLine();
            while(line != null){
                for(short i=0;i<line.length();i++){
                    if(line.charAt(i)==c){
                        count++;
                    }
                }
                line = br.readLine();
            }
            System.out.println("\nNo. of "+c+" in file is : "+count);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
