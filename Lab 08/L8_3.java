/*
    WAP to create Account class, which is representing a bank account where we can deposit and withdraw money.
    if we want to withdraw money which exceed our bank balance, we will not be allowed.
    Create 'InSufficientFundException' to handle above situation and display proper error message.
 */

import java.util.*;

public class L8_3 {
    public static void main(String[] args) throws InSufficientFundException{
        Scanner sc=new Scanner(System.in);
        Account a=new Account();
        System.out.println("\nEnter your Bank Balance :");
        a.bank_balance=sc.nextDouble();
        String s;
        double d,w=0;
        System.out.println("\nEnter 'D' for depositing & 'W' for withdrawing money.");
        s=sc.next();
        if(s.equalsIgnoreCase("D")){
            System.out.println("\nHow much money, do you want to deposit ?");
            d=sc.nextDouble();
            a.depositMoney(d);
            a.printBankBalance();
        }
        else if(s.equalsIgnoreCase("W")){
            try{
                System.out.println("\nHow much money, do you want to withdraw ?");
                w=sc.nextDouble();
                if(w>a.bank_balance){
                    throw new InSufficientFundException("Your Bank Balance isn't sufficient.");
                }
            }
            catch (InSufficientFundException ife){
                ife.printStackTrace();
                System.out.println("\nBank Balance - "+a.bank_balance);
                return;
            }
            a.withdrawMoney(w);
            a.printBankBalance();
        }
    }
}

class Account{
    double bank_balance;

    protected double depositMoney(double d){
        bank_balance = bank_balance + d;
        return bank_balance;
    }

    protected void withdrawMoney(double w){
        bank_balance = bank_balance - w;
    }

    protected void printBankBalance(){
        System.out.println("\nUpdated Bank Balance - "+bank_balance);
    }
}

class InSufficientFundException extends Exception{
    InSufficientFundException(String message) {
        super(message);
    }
}