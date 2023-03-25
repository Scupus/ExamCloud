public class DoubleArray extends Массивы{
    public static void main(String[] args) {
//        int[][] hash = new int[7][16];
//        int i, j, l = 0;
//        for (i = 0; i < 7; i++) {
//            for (j = 0; j < 16; j++) {
//                hash[i][j] = l++;
//                System.out.print(hash[i][j] + " ");
//            }
//            System.out.println();
//        }
//
        char ymb = 'a';
        String[][] tits = new String[3][6];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                tits[i][j] = ymb + "" + (i+1);
                System.out.print(tits[i][j] + " ");
            }
            ymb++;
            System.out.println();
        }
    }
}
