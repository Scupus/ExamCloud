package Урок9;

public class VarArgs2 {
    static void test(double... array) {
        System.out.println("test(double... array)");
        System.out.println("Количество элементов: " + array.length);
        for (double a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int... array) {
        System.out.println("test(int... array)");
        System.out.println("Количество элементов: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    static void test(int a) {
        System.out.println("test(int a)");
        System.out.println(a);
    }

    public static void main(String[] args) {
        test();
        test(3);
        test(1.6);
        test(1, 67);

    }
}
