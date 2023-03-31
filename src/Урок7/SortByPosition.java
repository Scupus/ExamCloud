package Урок7;

public class SortByPosition {
    public static void sort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            int pos = i;
            int min = arrays[i];
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < min) {
                    pos = j;
                    min = arrays[j];
                }
            }
            arrays[pos] = arrays[i];
            arrays[i] = min;
        }

    }
}
