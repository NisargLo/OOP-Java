// Demonstrate the use of Final Keyword.

import java.math.BigDecimal;

public class L6_7 {
    public static void main(String[] args) {
        Pie pi=new Pie();
        System.out.println("\nValue of Pie - "+pi.getPie()+".......\nIt is final (fix), & can't be changed.");
    }
}

final class Pie{
    final BigDecimal value_of_pie=new BigDecimal(Math.PI);

    final protected BigDecimal getPie(){
        return value_of_pie;
    }
}