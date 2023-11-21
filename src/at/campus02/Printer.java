package at.campus02;

public class Printer {

    public static void main(String[] args) {
        //printFromNToZero(5);
//        System.out.println("Rekursiver Start");
//        printFromNToZeroRecursive(5);
//        System.out.println("Rekursives Ende");
        printFromZeroToNRecursive(10_000);
    }

    // iterativ
    public static void printFromNToZero(int n) {
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }

    // rekursiv
    public static void printFromNToZeroRecursive(int n) {
        //System.out.println("In Rekursion mit: " + n);
        if (n < 0) {
            return;
        }
        System.out.println("n = " + n);
        printFromNToZeroRecursive(n - 1);
    }

    public static void printFromZeroToNRecursive(int n) {
        System.out.println("In Rekursion mit: " + n);
        if (n < 0) {
            return;
        }
        printFromZeroToNRecursive(n - 1);
        System.out.println("n = " + n);
    }
}
