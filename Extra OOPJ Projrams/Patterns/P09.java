/*
                *
               * *
              *   *
             *     *
            *********
 */

package Patterns;

public class P09 {
     public static void main(String [] args){
          byte i,j,k;
          for(i=1;i<=5;i++){
               if(i!=5){
               for(j=1;j<=(5-i);j++){
                    System.out.print(" ");
               }
               for(k=1;k<=i;k++){
                    if(k==1 || k==i){
                         System.out.print("* ");
                    }
                    else{
                         System.out.print("  ");
                    }
               }
               System.out.println();
               }
               else{
                    System.out.println("*********");
               }
          }
     }
}