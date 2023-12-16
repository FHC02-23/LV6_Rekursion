package at.campus02;

public class GGT {
    public static void main(String[] args) {
        System.out.println(ggtRecursive(11, 7));
        System.out.println(ggtRecursive(8, 4));
        System.out.println(ggtRecursive(6, 2));
        System.out.println(ggtRecursive(112, 44));
    }

    /**
     * Aufgabe: Finden Sie den größten gemeinsamen Teiler von a und b
     * Lösung: wenn b == 0 -> retourniere a (ist dann das Ergebnis)
     *         wenn b != 0 -> rufe ggtRecursive nochmals auf
     *                        ersetze a durch b
     *                        ersetze b durch den restwert (modulo) von a / b
     *
     * @param a Input 1
     * @param b Input 2
     * @return  den größten gemeinsamen Teiler von a und b
     */
    public static int ggtRecursive(int a, int b) {
        // Abbruchsbestimmung
        // if b == 0 -> return a
        if (b == 0) {
            return a;
        }
        // wenn b > 0
        // rufe ggtRecursive auf und ersetze a durch b, und b durch den Rest (modulo) von a/b
        int rest = a % b;
        return ggtRecursive(b, rest);

        // 2te Variante
        // a % b direkt übergeben
        //return ggtRecursive(b, a % b);
    }
}
