/*   Taking user input through Scanner class.
 */

import java.util.*;

public class L1_5 {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter NO. - ");
          int a = sc.nextInt();
          System.out.println("\nYour Integer = "+a);
          sc.close();
     }
}