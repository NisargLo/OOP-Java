// Newton's Backward Difference Method

public class M_3 {
     public static void main(String[] args) {
          double ans=0.0,d=Scan_Methods.d;
          int i,j,n=Scan_Methods.n;
          Scan_Methods s=new Scan_Methods();
          double[] x=new double[n];
          double[] y=new double[n];
          double[] a=new double[n];
          for(i=0;i<x.length;i++){
               x[i]=s.x[i];
               y[i]=s.y[i];
          }
          a[0]=y[y.length-1];
          double p=(d-x[n-1])/(x[1]-x[0]);
          for(i=1;i<a.length;i++){
               for(j=(y.length-1);j>=1;j--){
                    y[j]=y[j]-y[j-1];
               }
               a[i]=y[y.length-1];
          }
          ans+=a[0];
          for(i=1;i<n;i++){
               ans=ans+s.p_Plus(p,i)*a[i]/s.factorial(i);
          }
          System.out.printf("\nAnswer : y(%.2f) = %.5f",d,ans);
          System.out.println();
     }
}

// By - Nisarg Lo