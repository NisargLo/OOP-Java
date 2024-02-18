// Gauss's Backward Difference Method

public class M_5 {
     public static void main(String[] args) {
          int i, j, t = 0, n = Scan_DifferentMethods.n;
          Scan_DifferentMethods s = new Scan_DifferentMethods();
          double ans = 0, p;
          double[] x = new double[n];
          double[] y = new double[n];
          double[] a = new double[n];
          for (i = 0; i < n; i++) {
               x[i] = s.x[i];
               y[i] = s.y[i];
          }
          for (i = 0; i < n; i++) {
               if ((x[i] - s.d) >= 0 && i > 0) {
                    t = i;
                    break;
               }
          }
          p = (s.d - x[t]) / (x[1] - x[0]);
          for (i = 0; i < n; i++) {
               if (t < 0) {
                    a[i] = 0;
               } else {
                    a[i] = y[t];
                    if (i % 2 == 0) {
                         t--;
                    }
                    for (j = 1; j < n; j++) {
                         y[j - 1] = y[j] - y[j - 1];
                    }
               }
          }
          for (i = 1; i < n; i++) {
               if (a[i] != 0) {
                    ans = ans + s.p_Plus_Minus(p, i) * a[i] / s.factorial(i);
                    System.out.println("\nans : " + ans);
               } else {
                    break;
               }
          }
          ans += a[0];
          System.out.println("\na[0] : " + a[0]);
          System.out.printf("\nAnswer : y(%.2f) = %.5f", s.d, ans);
          System.out.println();
     }
}

// By - Nisarg Lo