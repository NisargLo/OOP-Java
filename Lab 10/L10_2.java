/*
    Write a program to replace all “word1” by “word2” from a file1, and output is written to file2 file and display the no. of replacement.
 */

import java.util.*;
import java.io.*;

public class L10_2 {
    public static void main(String[] args) throws IOException {
        short c = 0, i;
        Scanner sc = new Scanner(System.in);
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            File f1 = new File("File1.txt");
            File f2 = new File("File2.txt");
            f2.createNewFile();
            if (!f1.exists() || !f2.exists()) {
                throw new FileNotFoundException("\nFile not found.");
            }
            System.out.println("\nEnter Word 1 :");
            String word1 = sc.next();
            System.out.println("\nEnter Word 2 :");
            String word2 = sc.next();
            br = new BufferedReader(new FileReader(f1));
            bw = new BufferedWriter(new FileWriter(f2));
            String line = br.readLine();
            while (line != null) {
                StringBuilder changedLine = new StringBuilder();
                String[] s = line.split(" ");
                for (i = 0; i < s.length; i++) {
                    if (s[i].equals(word1)) {
                        changedLine.append(word2).append(" ");
                        c++;
                    } else {
                        changedLine.append(s[i]).append(" ");
                    }
                }
                bw.write(changedLine.toString());
                bw.newLine();
                line = br.readLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("\nReplacement counts : " + c);
            br.close();
            bw.close();
        }
    }
}