/*
    *  *  *  *  *
       *  *  *  *
          *  *  *
             *  *
                *
 */

package Patterns;

public class P12 {
    public static void main(String[] args){
        byte i,j,k;
        for(i=1;i<=5;i++){
            for(j=1;j<i;j++){
                System.out.print("   ");
            }
            for(k=0;k<=(5-i);k++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}