/*
    *  *  *  *  *
    *  *  *  *
    *  *  *
    *  *
    *
 */

package Patterns;

public class P03 {
    public static void main(String[] args){
        byte i,j;
        for(i=5;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
    }
}