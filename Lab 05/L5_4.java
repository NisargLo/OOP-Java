/*   Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance.
     Also create methods getAccountDetails() and displayAccountDetails().
*/

import java.util.Scanner;

public class L5_4 {
     public static void main(String[] args) {
          Bank_Account Details=new Bank_Account();
          Details.getAccountDetails();
          Details.displayAccountDetails();    
     }
}

class Bank_Account{
     Scanner sc=new Scanner(System.in);
     int accountNo;
     String userName=new String();
     String email=new String();
     String accountType=new String("Saving");
     double accountBalance;
     public void getAccountDetails(){
          System.out.println("\nEnter Account No. :");
          this.accountNo=Integer.parseInt(sc.nextLine());
          System.out.println("\nEnter Username :");
          this.userName=sc.nextLine();
          System.out.println("\nEnter E-Mail :");
          this.email=sc.nextLine();
          System.out.println("\nEnter Account Type :");
          this.accountType=sc.nextLine();
          System.out.println("\nEnter Account Balance :");
          this.accountBalance=sc.nextDouble();
     }

     public void displayAccountDetails(){
          System.out.println("\n\nAccount Details :-");
          System.out.println("\nAccount No. - "+accountNo);
          System.out.println("Username - "+userName);
          System.out.println("E-Mail - "+email);
          System.out.println("Account Type - "+accountType);
          System.out.println("Account Balance - "+accountBalance);
     }
}