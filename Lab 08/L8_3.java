/*
    WAP to create Account class, which is representing a bank account where we can deposit and withdraw money.
    if we want to withdraw money which exceed our bank balance, we will not be allowed.
    Create 'InSufficientFundException' to handle above situation and display proper error message.
 */

import java.util.*;

public class L8_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Account a=new Account();

        String s;
        double d,w;
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
                if(w>a.getBank_balance()){
                    throw new InSufficientFundException("Your Bank Balance isn't sufficient.");
                }
            }
            catch (InSufficientFundException ife){
                ife.printStackTrace();
                System.out.println("\nBank Balance - "+a.getBank_balance());
                return;
            }
            a.withdrawMoney(w);
            a.printBankBalance();
        }
    }
}

class Account{
    private double bank_balance;

    Account(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter your Bank Balance :");
        bank_balance=sc.nextDouble();
    }

    protected double getBank_balance() {
        return bank_balance;
    }

    protected void depositMoney(double d){
        bank_balance = bank_balance + d;
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