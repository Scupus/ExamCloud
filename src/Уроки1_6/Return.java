package Уроки1_6;

public class Return {
    public static double getRandomValue(int i) {
        return Math.random() * i;
    }

    public static void main(String[] args) {
        double d = getRandomValue(115);
        System.out.println(d);
    }
}
