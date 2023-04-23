package Урок9;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle("green", 4, 3, 12);
        shapes[1] = new Circle("blue", 5, 2, 10);
        shapes[2] = new Rectangle("brown", 1, 2, 10,6);
        shapes[3] = new Rectangle("white", 3, 2, 8,2);
        for (Shape shape:shapes) {
            shape.draw();
        }
    }
}
