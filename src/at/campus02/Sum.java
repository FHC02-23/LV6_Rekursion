package at.campus02;

import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        System.out.println(sumUpRecursive(3));
        System.out.println(sumUpIterative(3));
    }

    public static int sumUpIterative(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
             sum += i;
        }
        return sum;
    }

    public static int sumUpRecursive(int n) {
        if (n <= 0) {
            return 0;
        }

        return n + sumUpRecursive(n - 1);
    }

    public static int sumUpListIterative(ArrayList<Integer> values) {
        // Hilfswert anlegen
        // jeden Wert in der Liste addieren
        // summe retour liefern
        return 0;
    }
    public static int sumUpListRecursive(ArrayList<Integer> values) {
        // Abbruchsbestimmung
        if (values.size() == 0) {
            //values.isEmpty() -> zweite Möglichkeit
            return 0;
        }
        // summieren + sumUpListRecursive(values -> updaten)
        //int val = values.get(0);
        //values.remove(0); // => oder
        int val = values.remove(0);
        // summe retournieren
        return val + sumUpListRecursive(values);
    }
}
