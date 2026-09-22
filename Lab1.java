
public class Lab1 {

    public static double eElement(long ci, double xj) {
        if (ci == 10) {
            return Math.atan(1.0 / Math.exp(Math.abs(Math.asin(1.0 / Math.exp(Math.abs(xj))))));
        } else if (ci == 4 || ci == 14 || ci == 18 || ci == 20 || ci == 22) {
            return 0.5 /Math.cbrt(Math.tan(xj));
        } else {
            return Math.cbrt(Math.atan(Math.sin(Math.cos(xj)*(1 - Math.pow(xj*(1 - xj), 2)))));
        }
    }

    public static void prtMatrix(double[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(Math.round(m[i][j] * 1000) / 1000.0 + " ");
            }
            System.out.println();
        }
    }

    public static void main() {
        long[] c = new long[10];
        for (int i = 0; i < c.length; i++) {
            c[i] = 4 + 2 * i;
        }

        double[] x = new double[19];
        double min = -11.0;
        double max = 10.0;
        for (int j = 0; j < x.length; j++) {
            x[j] = min + Math.random() * (max - min);
        }

        double[][] e = new double[10][19];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < x.length; j++) {
                e[i][j] = eElement(c[i], x[j]);
            }
        }
        prtMatrix(e);
    }
}
