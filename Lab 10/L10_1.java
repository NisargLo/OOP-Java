/*
    Write a program that counts number of characters, words, and lines in a file. 
    Use exceptions to check whether the file that is read exists or not.
 */

import java.io.*;

public class L10_1 {
    public static void main(String[] args) throws Exception {
        try {
            File f = new File("C:/Users/student/Desktop/Nisarg/Java/Lab 10/File.txt");
            if (!f.exists()) {
                throw new FileNotFoundException("\nFile not found.");
            }
            int countChar = 0, countWord = 0, countLine = 0;
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line = br.readLine();
            while (line != null) {
                countLine++;
                countChar += line.length();
                String[] a = line.trim().split(" ");
                countWord += a.length;
                line = br.readLine();
            }
            System.out.println("\nNo. of Characters in File = " + countChar);
            System.out.println("\nNo. of Words in File = " + countWord);
            System.out.println("\nNo. of Lines in File = " + countLine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}