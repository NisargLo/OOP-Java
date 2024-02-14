//linear search

import java.util.Scanner;

public class Linear_Search {
     public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int[] a = {1,2,3,4,5,6,7,8,9,10};
          System.out.println("Enter NO. to Search :");
          int i,n=sc.nextInt();
          for(i=0;i<a.length;i++){
               if(n==a[i]){
                    System.out.println("NO. found in index - "+i);
                    return;
               }
          }
          System.out.println("\nNO. not found");
          sc.close();
     }    
}