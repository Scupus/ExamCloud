import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Locale;

public class KrivoyMassiv extends Массивы{
    public static void main(String[] args) {
        /* region
        int[][] dich = new int[5][];
        dich[1] = new int[2];
        dich[0] = new int[3];
        dich[2] = new int[4];
        dich[3] = new int[1];
        dich[4] = new int[4];
        int k = 0;
        for (int i = 0; i < dich.length; i++) {
            for (int j = 0; j < dich[i].length; j++) {
                dich[i][j] = 2 * k++;
                System.out.print(dich[i][j] + " ");
            }
            System.out.println();
        }
    char[][] dichChar = {
            {'f', 't','s','v'},
            {'f', 't','s','v'}
        };
        for (char[] again:dichChar) {
            for (char again1 : again) {
                System.out.print(again1);
            }
            System.out.println();
        }
        end region */
        /*int[] youngPussy = {5, 90, 60, 34, 98, 88};
        int[][] squarePussy = {
                {8, 98, 1, 6, 50},
                {41, 86, 2},
                {123, 1},
                {12, 38, 46, 56, 17}
        };
        System.out.println("Длина массива1 : " + youngPussy.length);
        System.out.println("Количество строк массива2 : " + squarePussy.length);
        System.out.println("Длина третьей строки массива : " + squarePussy[2].length);
        System.out.println(Arrays.deepToString(squarePussy));
        Arrays.sort(youngPussy);
        System.out.println(Arrays.toString(youngPussy));
        int pos1 = Arrays.binarySearch(youngPussy,17);
        System.out.println(pos1);
        System.arraycopy(youngPussy, 2,squarePussy[3],1,2 );
        System.out.println(Arrays.toString(squarePussy[3]));*/
        int n = 25;
        LocalTime localTime1 = LocalTime.now();
        System.out.println("Juicy Pussy " + Fibonachi.fibo(n));
        LocalTime localTime2 = LocalTime.now();
        Duration duration = Duration.between(localTime2, localTime1);
        System.out.println("Время " + duration);
    }
}
