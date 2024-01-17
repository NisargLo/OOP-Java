import java.util.Scanner;

public class L2_5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fahrenheit : ");
        float f=sc.nextFloat();
        float c=(f-32)*5/9;
        System.out.println("\nCelsius = "+c);
        sc.close();
    }
}