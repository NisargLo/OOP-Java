//Write an application that searches through its command-line argument. If an argument is found that does not begin with and upper case letter, display error message and terminate.

public class L4_6 {
     public static void main(String[] args) {
          String s = args[0];
          if(s.charAt(0)<='A' && s.charAt(0)>='Z'){
               System.out.println("Error: Could not run the Program - L4_6.java");
               System.exit(1);
          }
     }
}