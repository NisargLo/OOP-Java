// Newton's Forward Difference Method

public class M_2 {
     public static void main(String[] args) {
          double ans = 0, p;
          int i, j, n = Scan_DifferentMethods_Newton.n;
          Scan_DifferentMethods_Newton s = new Scan_DifferentMethods_Newton();
          double[] x = new double[n];
          double[] y = new double[n];
          double[] a = new double[n];
          for (i = 0; i < n; i++) {
               x[i] = s.x[i];
               y[i] = s.y[i];
          }
          p = (s.d - x[0]) / (x[1] - x[0]);
          for (i = 0; i < n; i++) {
               a[i] = y[0];
               for (j = 1; j < n; j++) {
                    y[j - 1] = y[j] - y[j - 1];
               }
          }
          for (i = 1; i < n; i++) {
               ans = ans + s.p_Minus(p, i) * a[i] / s.factorial(i);
          }
          ans += a[0];
          System.out.printf("\nAnswer : y(%.2f) = %.5f", s.d, ans);
          System.out.println();
     }
}

// By - Nisarg Lo