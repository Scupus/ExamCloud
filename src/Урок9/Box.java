package Урок9;

public class Box {
    int width, length, height;

    public Box(int width, int length, int height) {
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void getBoxVolume() {
        double v = this.width * this.height * this.length;
        System.out.println("Объем коробки " + v + "/");
    }
}
