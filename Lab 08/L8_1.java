/*
    Write a method for computing x raise to y doing repetitive multiplication.
    X and y are of type integer and are to be given as command line arguments.
    Raise and handle exception(s) for invalid values of x and y.
 */

public class L8_1 {
    public static void main(String[] args) {
        int x=0,y=0,z=0;
        try{
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z = (int)(Math.pow(x,y));
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("\n"+x+" raise to "+y+" = "+z);
    }
}