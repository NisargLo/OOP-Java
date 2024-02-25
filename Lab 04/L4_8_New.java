/*
     Write an interactive program to print a diamond shape. For example, if user enters the number 3, the diamond will be as follows:
     
       *
      * *
     * * *
      * *
       *
*/

public class L4_8_New {
    public static void main(String[] args) {
        byte i,j,k;
        for(i=1;i<=5;i++) {
            if(i<=3){
                for(j=1;j<=3-i;j++){
                    System.out.print(" ");
                }
                for(k=1;k<=i;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(j=3; j<=i-1; j++){
                    System.out.print(" ");
                }
                for(k=5;k>=i;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}