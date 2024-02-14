//Sorting in Ascending order

public class sort{
     public static void main(String[] args) {
          int[] a = {4,2,1,9,6,3,7,5,8,10};
          int i,j,temp;
          for(i=0;i<a.length;i++){
               for(j=i+1;j<a.length;j++){
                    if(a[i]>a[j]){
                         temp=a[i];
                         a[i]=a[j];
                         a[j]=temp;
                    }    
               }
          }
          System.out.println("Ascending Order (a) :");
          for(i=0;i<a.length;i++){
               System.out.print(a[i]+", ");
          }

          //using method given in ppt

          int[] b = {4,2,1,9,6,3,7,5,8,10};
          for(i=0;i<b.length;i++){
               int cm=b[i];
               int cmi=i;
               for(j=i+1;j<b.length;j++){
                    if(cm>b[j]){
                         cm=b[j];
                         cmi=j;
                    }
               }
               if(cmi!=i){
                    b[cmi]=b[i];
                    b[i]=cm;
               }
          }
          System.out.println("\n\nAscending Order (b) :");
          for(i=0;i<b.length;i++){
               System.out.print(b[i]+", ");
          }
     }     
}