import java.util.Scanner;

public class L2_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius of Circle : ");
        int r=sc.nextInt();
        double a=(Math.PI)*(r*r);
        System.out.println("\nArea of Circle = "+a);
        sc.close();
    }
}