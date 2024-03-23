/*
    Create your own Custom Exception.
    Store date & time in which Custom Exception occured, in a log file.
 */

package Exception;
import java.util.*;
import java.io.*;

public class My_Exception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        byte n;
        try{
            try{
                System.out.println("\nEnter any Word or Letter :");
                n=sc.nextByte();
            }
            catch (InputMismatchException ime){
                throw new Custom_Exception(" My Custom Exception Occured.");
            }
        }
        catch (Custom_Exception ce){
            ce.saveExceptionToLogFile();
            System.out.println("\nDate & Time of Exception, saved to log file.");
        }
        sc.close();
    }
}

class Custom_Exception extends Exception{
    Custom_Exception(String Message) {
        super(Message);
    }

    protected void saveExceptionToLogFile(){
        PrintStream ps;
        try{
            ps = new PrintStream(new File("My_Exception.log"));
            ps.println(new Date()+getMessage());
        }
        catch(FileNotFoundException fne){
            fne.printStackTrace();
        }
    }
}