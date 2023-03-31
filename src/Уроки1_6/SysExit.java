package Уроки1_6;

public class SysExit {
    public static void main(String[] args) {
        System.out.println("До возврата.");
        method(false);
        System.out.println("Этот оператор выполняться не будет.");
    }

    public static void method(boolean flag) {
        if (flag) {
            return;
        }
        System.out.println("Этот оператор метода выполняться не будет.");
    }
}
