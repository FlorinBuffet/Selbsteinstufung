public class Aufgabe3 {
    public static void main(String[] args) throws Exception {
        System.out.println(istPrimzahl(83) + " Expected: true");
        System.out.println(istPrimfaktor(7, 70) + " Expected: true");
        System.out.println(istPrimfaktor(8, 80) + " Expected: false");
        System.out.println(istPrimfaktor(7, 8) + " Expected: false");
    }

    public static boolean istPrimzahl(int prim) {
        for (int i = 2; i < Math.sqrt(prim); i++) {
            if (prim % i == 0)
                return false;
        }
        return true;
    }

    public static boolean istPrimfaktor(int p, int n) {
        return (n % p == 0) && istPrimzahl(p);
    }
}