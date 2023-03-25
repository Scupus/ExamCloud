import java.util.Arrays;

public class ArrayDemo1 extends Массивы{
    public static void main(String[] args) {
        String[] array = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        for (String str : array) {
            System.out.print(str + " ");
        }
        System.out.println();
        double[] doubleArray = {1.8, 6.23, 5.84, 3.0, 4.13, 5.36};
        for (double doub : doubleArray) {
            System.out.println(doub);
        }
        int n = 1;
        while (n < 11) {
            System.out.println("Тик " + n++ + " раз");
            if (n == 11) {
                System.out.println("Бэнг");
            }
        }
        int v = 10;
        switch (v) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;
            case 3, 4, 5:
                System.out.println("Весна");
                break;
            case 6, 7, 8:
                System.out.println("Лето");
                break;
            case 9, 10, 11:
                System.out.println("Осень");
                break;
        }
    }
}
