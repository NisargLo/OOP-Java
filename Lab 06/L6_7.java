// Demonstrate the use of Final Keyword.

public class L6_7 {
    public static void main(String[] args) {
        Pie pi=new Pie();
        System.out.println("\nValue of Pie upto 15 decimal places - "+pi.getPie()+"\nIt is final (fix), & can't be changed.");
    }
}

final class Pie{
    final double value_of_pie = Math.PI;

    final double getPie(){
        return value_of_pie;
    }
}