import java.util.*;

public class L2_3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Mathematical Operator : ");
        char c=sc.nextLine().charAt(0);
        System.out.println("\nEnter NO. 1 : ");
        int a=sc.nextInt();
        System.out.println("\nEnter NO. 2 : ");
        float b=sc.nextFloat();
        switch(c){
            case '+' : System.out.println("\nAddition = "+(a+b));
            break;
            case '-' : System.out.println("\nSubstraction = "+(a-b));
            break;
            case '*' : System.out.println("\nMultiplication = "+(a*b));
            break;
            case '/' : System.out.println("\nDivision = "+(a/b));
            break;
        }
    }
}
