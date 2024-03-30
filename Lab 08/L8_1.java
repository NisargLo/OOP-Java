/*
    Write a method for computing x raise to y doing repetitive multiplication.
    X and y are of type integer and are to be given as command line arguments.
    Raise and handle exception(s) for invalid values of x and y.
 */

 public class L8_1 {
    public static void main(String[] args) {
        double x,y,z1,z2;
        try{
            x = Integer.parseInt(args[0]);
            y = Integer.parseInt(args[1]);
            z1 = (int)(Math.pow(x,y));
            z2 = x/y;
        }
        catch (NumberFormatException nfe){
            nfe.printStackTrace();
            System.out.println("\nPlease write numbers.\nException Message - "+nfe.getMessage());
            return;
        }
        catch (ArithmeticException ae){
            ae.printStackTrace();
            System.out.println("\nYou can't divide any number by zero.\nException Message - "+ae.getMessage());
            return;
        }
        catch (ArrayIndexOutOfBoundsException aiobe){
            aiobe.printStackTrace();
            System.out.println("\nWrite all numbers.\nException Message - "+aiobe.getMessage());
            return;
        }
        catch (Exception e){
            e.printStackTrace();
            return;
        }
        System.out.println("\n"+x+" raise to "+y+" = "+z1);
        System.out.println("\n"+x+" divide by "+y+" = "+z2);
    }
}