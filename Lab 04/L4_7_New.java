/*
     Write an interactive program to print a string entered in a pyramid form. For instance, the string "stream" has to be displayed as follows:
                  
          s
         s t
        s t r
       s t r e
      s t r e a
     s t r e a m
*/
public class L4_7_New {
    public static void main(String[] args) {
        String s = "stream";
        byte i,j,k;
        for(i=1;i<=6;i++){
            for(j=0;j<6-i;j++) {
                System.out.print(" ");
            }
            for(k=0;k<i;k++){
                System.out.print(s.charAt(k));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}