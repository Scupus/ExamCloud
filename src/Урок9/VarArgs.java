package Урок9;

public class VarArgs {
    static void test(int... array) {
        System.out.println("Количество элементов: " + array.length);
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test();
        test(1, 5, 76);
        test(13, 12, 1, 8);
        test(1, 2, 3, 4, 5);
    }
}
