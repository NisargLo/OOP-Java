//binary search

import java.util.Scanner;

public class bs {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int[] a = {1,2,3,4,5,6,7,8,9,10};
          System.out.println("Enter NO. to Search :");
          int n = sc.nextInt();
          int low=0,high=(a.length-1);
          boolean f = false;
          while(high>=low){
               int mid=(high+low)/2;
               if(n<a[mid]){
                    high=mid-1;
               }
               else if(n==a[mid]){
                    System.out.println("\nNO. found in index - "+mid);
                    f=true;
                    break;
               }
               else{
                    low=mid+1;
               }
          }
          if(f==false){
               System.out.println("\nNO. is not in Array");
          }
          sc.close();
     }
}