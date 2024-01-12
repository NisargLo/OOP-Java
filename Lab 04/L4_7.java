/*
     Write an interactive program to print a string entered in a pyramid form. For instance, the string "stream" has to be displayed as follows:
                  
     s
     st
     str
     stre
     strea
     stream
*/
public class L4_7 {
     public static void main(String[] args) {
          String s = "stream";
          byte i,j;
          for(i=1;i<=6;i++){
               for(j=0;j<i;j++){
                    System.out.print(s.charAt(j));
               }
               System.out.println();
          }
     }
}