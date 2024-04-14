/*
    Write a complete program to accept N integer numbers from the command line.
    Raise and handle exceptions for following cases :
        a. - when a number is –ve
        b. - when a number is evenly divisible by 10
        c. - when a number is greater than 1000 and less than 2000
        d. - when a number is greater than 7000
    Skip the number if an exception is raised for it, otherwise add it to find total sum.
 */

public class L8_2 {
    public static void main(String[] args) {
        int n,i=0,s=0;
        try{
            while (i<args.length){
                n=Integer.parseInt(args[i]);
                if(n<0 || n%10==0 || (n>1000 && n<2000) || n>7000){
                    throw new My_Exception("First Custom Exception occured at number "+(i+1)+".");
                }
                else{
                    s=s+n;
                }
                i++;
            }
        }
        catch (My_Exception me){
            me.printStackTrace();
        }
        finally{
            System.out.println("Total Sum until First Custom Exception occured = "+s);
        }
    }
}

class My_Exception extends Exception {
    My_Exception(String S) {
            super(S);
    }
}