// Newton's Backward Difference Method

public class M_3 {
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
          a[0] = y[n - 1];
          p = (s.d - x[n - 1]) / (x[1] - x[0]);
          for (i = 1; i < n; i++) {
               for (j = (n - 1); j >= 1; j--) {
                    y[j] = y[j] - y[j - 1];
               }
               a[i] = y[n - 1];
          }
          ans += a[0];
          for (i = 1; i < n; i++) {
               ans = ans + s.p_Plus(p, i) * a[i] / s.factorial(i);
          }
          System.out.printf("\nAnswer : y(%.2f) = %.5f", s.d, ans);
          System.out.println();
     }
}

// By - Nisarg Lo