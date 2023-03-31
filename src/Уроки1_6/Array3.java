package Уроки1_6;

public class Array3 {
    public static void main(String[] args) {
        int[] testScores = {7, 6, 5, 2};
        for (int tret : testScores) {
            System.out.print(tret + " ");
        }
        System.out.println();
        testScores = new int[]{1, 4, 3, 0};
        for (int tret : testScores) {
            System.out.print(tret + " ");
        }
        System.out.println();
        print(new int[]{8,2,9,1});
    }

    public static void print(int[] array) {
        for (int tret : array) {
            System.out.print(tret + " ");
        }
        System.out.println();
    }
}
