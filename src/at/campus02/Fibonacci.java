package at.campus02;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(10)); // Tipp: Zeile kopieren -> STRG + D
        System.out.println(fibonacci(13));
        System.out.println(fibonacci(15));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
    }

    public static int fibonacci(int n) {
        // Abbruchsbestimmung
        if (n == 1 || n == 2) {
            return 1;
        }

        // rekursionsschritt
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}