import java.util.Scanner;

public class L2_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter Radius of Circle : ");
        int r=sc.nextInt();
        double a=(3.14)*(r*r);
        System.err.println("\nArea of Circle = "+a);
    }
}
