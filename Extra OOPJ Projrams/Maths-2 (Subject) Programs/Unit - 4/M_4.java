// Gauss's Forward Difference Method

public class M_4 {
     public static void main(String[] args) {
          double ans = 0, p;
          int i, j, t = 0, c = 1, n = Scan_DifferentMethods.n;
          Scan_DifferentMethods s = new Scan_DifferentMethods();
          double[] x = new double[n];
          double[] y = new double[n];
          double[] a = new double[n];
          for (i = 0; i < n; i++) {
               x[i] = s.x[i];
               y[i] = s.y[i];
          }
          for (i = 0; i < n; i++) {
               if ((x[i] - s.d) >= 0 && i > 0) {
                    if (s.d > (x[0] + x[n - 1]) / 2) {
                         t = i - 1;
                    } else {
                         t = i;
                    }
                    break;
               }
          }
          p = (s.d - x[t]) / (x[1] - x[0]);
          for (i = 0; i < n; i++) {
               if (t < 0) {
                    a[i] = 0;
               } else {
                    a[i] = y[t];
                    if (i % 2 != 0 && i > 0) {
                         t--;
                    }
                    for (j = 1; j < n; j++) {
                         if (j <= n - c) {
                              y[j - 1] = y[j] - y[j - 1];
                         } else {
                              y[j - 1] = 0;
                              y[j] = 0;
                         }
                    }
                    c++;
               }
          }
          for (i = 1; i < n; i++) {
               ans = ans + s.p_Minus_Plus(p, i) * a[i] / s.factorial(i);
          }
          ans += a[0];
          System.out.printf("\nAnswer : y(%.2f) = %.5f", s.d, ans);
          System.out.println();
     }
}

// By - Nisarg Lo