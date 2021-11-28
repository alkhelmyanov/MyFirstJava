public class Main {
    public static void main(String[] args) {
       /* int a = 1;
        long l = 1000000000L;
        float f = 12.3f;
        double d = 12.43;
        String s = "Привет черти";
        boolean b = true;
        System.out.println(a);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        System.out.println(b);*/

        System.out.println(vichisleniePrimera(2, 5, 30, 2));
        System.out.println(sravnenieChisel(16, 5));
    }

    private static int vichisleniePrimera(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean sravnenieChisel(int a, int b) {
        int summa = a + b;
        if (summa >= 10 && summa <= 20) {
            return true;
        } else {
            return false;
        }
    }


}


