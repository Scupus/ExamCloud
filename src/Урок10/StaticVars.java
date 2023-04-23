package Урок10;

public class StaticVars {
    int f = 14;
    public static int r = 95;

    public static void main(String[] args) {
        StaticVars staticVars = new StaticVars();
        System.out.println(staticVars.f);
        System.out.println(r);
    }
}
