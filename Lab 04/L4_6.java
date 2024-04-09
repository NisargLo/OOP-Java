//Write an application that searches through its command-line argument. If an argument is found that does not begin with and upper case letter, display error message and terminate.

public class L4_6 {
     public static void main(String[] args) {
          String s = args[0];
          for(byte i=0;i<args.length;i++){
               if(args[i].charAt(0)>='A' && args[i].charAt(0)<='Z'){
                    System.out.print(args[i]+" ");
               }
               else{
                    System.out.println("Error: Could not run Java Program - L4_6.java\nError occured at - \'"+args[i]+"'");
                    return;
               }
          }
     }
}