public class Fibonachi extends Массивы{
    public static int fibo(int n) {
        int first = 0;
        int second = 1;
        int result = n;
        for (int i = 1; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }
}
