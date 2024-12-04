/*
     1
     2   3
     4   5   6
     7   8   9  10
    11  12  13  14  15
 */

 package Patterns;

public class P08 {
     public static void main(String[] args) {
          byte i,j,k=1;
          for(i=1;i<6;i++){
               for(j=0;j<i;j++){
                    System.out.printf("%2d  ",k);
                    k++;
               }
               System.out.println();
          }
     }
     
}