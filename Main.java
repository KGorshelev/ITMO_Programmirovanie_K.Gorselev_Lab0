//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int ifinarray(int x, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return 1;
            }
        }

        return 0;
    }

    public static void vivod(int j, int i, double arrz[][]) {
        System.out.print(String.format("| %15.5f", arrz[j][i]));
    }

    public static double arcctg(float x) {
        return Math.PI / 2 - Math.atan(x);
    }

    public static double lg(float x) {
        return Math.log(Math.sqrt(Math.abs(x)));
    }

    public static double cos(float x) {
        return Math.pow(3, (((Math.cos(x / 3)) / 12)));
    }

    public static double arcfunc(double x) {
        double e = 2.71828;
        double pi = 3.1415;
        double degre1 = Math.sin(Math.cos(x));
        double degre2 = Math.atan((x - 0.5) / 15);
        double mn1 = Math.atan((x - 0.5) / 15) * (Math.asin((x - 0.5) / 15) - 1);
        return Math.pow(Math.pow(degre1, pi * (Math.pow(degre2, mn1) - 3)), e);
    }

    public static float rnd(float min, float max) {
        max = -min;
        return (float) (Math.random() * ++max) + min;
    }


    public static void main(String[] args) {
        System.out.println("Hi, "+args[0]+" !");
        //3 5 7 9 11 13 15 17 19 21 23
        int arry[] = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23};
        float arrx[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int arrquest[] = {3, 5, 7, 17, 21};

        for (int i = 0; i < arrx.length; i++) {
            float min = -8;
            float max = 7;
            arrx[i] = rnd(min, max);
        }
        double[][] arrz = new double[11][16];
        for (int i = 0; i < 11; i++) {
            if (arry[i] == 9) {
                for (int j = 0; j < 16; j++) {
                    arrz[i][j] = lg(arrx[j]);
                }
            }
            if (ifinarray(arry[i], arrquest) == 1) {
                for (int j = 0; j < 16; j++) {
                    arrz[i][j] = cos(arrx[j]);
                }
            } else {
                for (int j = 0; j < 16; j++) {
                    arrz[i][j] = arcfunc(arrx[j]);
                }
            }

        }
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 11; j++) {
                vivod(j, i, arrz);

            }
            System.out.println("");

        }

    }
}
