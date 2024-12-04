/*   Create a class which ask the user to enter a sentence, and it should display count of each vowel type in the sentence. 
     The program should continue till user enters a word “quit”. 
     Display the total count of each vowel for all sentences.
*/

import java.util.Scanner;

public class L5_3 {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String s=new String("new");
          for(byte i=1;;i++){
               System.out.println("\nEnter Sentence "+i+" :");
               s=sc.nextLine();
               if(s.equalsIgnoreCase("quit")){
                    sc.close();
                    return;
               }
               Sentence S=new Sentence(s);
               S.vowelCount();
          }
     }
}

class Sentence{
     String s=new String();
	int count_a, count_e, count_i, count_o, count_u;
     public Sentence(String s){
          this.s=s;
     }
     protected void vowelCount(){
          for(int i=0;i<s.length();i++){
               if(s.charAt(i)=='a' || s.charAt(i)=='A'){
                    count_a++;
               }
               else if(s.charAt(i)=='e' || s.charAt(i)=='E'){
                    count_e++;
               }
               else if(s.charAt(i)=='i' || s.charAt(i)=='I'){
                    count_i++;
               }
               else if(s.charAt(i)=='o' || s.charAt(i)=='O'){
                    count_o++;
               }
               else if(s.charAt(i)=='u' || s.charAt(i)=='U'){
                    count_u++;
               }
          }
          System.out.print("\nNO. of A = "+count_a+"\n");
          System.out.print("NO. of E = "+count_e+"\n");
          System.out.print("NO. of I = "+count_i+"\n");
          System.out.print("NO. of O = "+count_o+"\n");
          System.out.print("NO. of U = "+count_u+"\n");
     }
}