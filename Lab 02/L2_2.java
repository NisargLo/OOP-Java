/*
    Demonstrate the Operator precedence. 
        i)  10 + 20 * 30
        ii)  100 / 10 * 100
        iii)  5 * 4 / 4 % 3
        iv)  100 + 200 / 10 – 3 * 10
 */

public class L2_2{
    public static void main(String[] args){
        short a=10+20*30;
        short b=100/10*100;
        short c=5*4/4%3;
        short d=100+200/10-3*10;
        System.out.println("\nAns of (i) = "+a);
        System.out.println("\nAns of (ii) = "+b);
        System.out.println("\nAns of (iii) = "+c);
        System.out.println("\nAns of (vi) = "+d);
    }
}