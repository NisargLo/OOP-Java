/*
     Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as follows:
     
     *
     * *
     * * *
     * *
     *
*/

public class L4_8 {
     public static void main(String[] args) {
          byte i,j;
          for(i=1;i<=3;i++) {
               for(j=0;j<i;j++){
                    System.out.print("*");
               }
               System.out.println();                    
          }
          for(i=1;i<=2;i++){
               for(j=2;j>=i;j--){
                    System.out.print("*");
               }
               System.out.println();
          }
     }
}