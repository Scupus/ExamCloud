package Урок7;


import java.util.Arrays;

import static Урок7.BubbleSorter.sort;
import static Уроки1_6.Return.getRandomValue;

public class Main {
    public static void main(String[] args) {
        //regionСвап
//        int f = 5;
//        int t = 8;
//        System.out.println("До свапа f = " + f + ", t = " + t);
//        t = t + f;
//        f = t - f;
//        t = t - f;
//        System.out.println("После обмена f = " + f + ", t = " + t);
//endregionСвап
        //regionИнвертирование массива
//        int[] invertArray = {1, 2, 3, 4, 5, 6, 7, 8};
//        for (int tmp1 : invertArray) {
//            System.out.print(tmp1 + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < invertArray.length / 2; i++) {
//            int tmp = invertArray[i];
//            invertArray[i] = invertArray[invertArray.length - i - 1];
//            invertArray[invertArray.length - i - 1] = tmp;
//        }
//        for (int tmp1 : invertArray) {
//            System.out.print(tmp1 + " ");
//        }
//        System.out.println();
//endregionИнвертирование массива
        //regionСортировка пузырем
//        int[][] arrayForSort = {
//                {},
//                {1},
//                {7, 2, 0, 3},
//                {12, 63, 54, 52, 18, 34},
//                {119, 94, 7, 55, 5723, 498, 972, 48, 766},
//        };
//        for (int[] tmp : arrayForSort) {
//            System.out.print(Arrays.toString(tmp) + " => ");
//            BubbleSorter.sort(tmp);
//            System.out.println(Arrays.toString(tmp));
//
//                }
//endregionСортировка пузырем
        //regionИнвертирование массивов с вызовом метода из другого класса
//        int[] arr1 = {};
//        int[] arr2 = {7, 12};
//        int[] arr3 = {15, 62, 56, 70};
//        int[] arr4 = {566, 33, 6, 57, 632, 46, 88, 58};
//        System.out.print(Arrays.toString(arr1) + " => ");
//        InvertArray.invert(arr1);
//        System.out.println(Arrays.toString(arr1));
//        System.out.print(Arrays.toString(arr2) + " => ");
//        InvertArray.invert(arr2);
//        System.out.println(Arrays.toString(arr2));
//        System.out.print(Arrays.toString(arr3) + " => ");
//        InvertArray.invert(arr3);
//        System.out.println(Arrays.toString(arr3));
//        System.out.print(Arrays.toString(arr4) + " => ");
//        InvertArray.invert(arr4);
//        System.out.println(Arrays.toString(arr4));
//        System.out.println(arr4.length);
//endregionИнвертирование массивов с вызовом метода из другого класса
        int[] arr5 = {15, 62, 56, 70};
        int[] arr6 = {566, 33, 6, 57, 632, 46, 88, 58};
        System.out.print(Arrays.toString(arr5) + " => ");
        sort(arr5);
        System.out.println(Arrays.toString(arr5));
        double d = getRandomValue(10);
        System.out.println(d);
        System.out.print(Arrays.toString(arr6) + " => ");
        sort(arr6);
        System.out.println(Arrays.toString(arr6));
    }
}

