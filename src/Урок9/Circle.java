package Урок9;

public class Circle extends Shape {
    int x, y, radius;

    public Circle(String color, int x, int y, int radius) {
        super(color);
        this.x = x;
        this.y = y;
        this.radius = radius;

    }
    //regionGetSetCircle

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    //endregionGetSetCircle

    @Override
    public void draw() {
        System.out.println("Рисуем круг, цвет круга " + getColor() + ", координаты центра круга " + getX() + " " + getY() + ", радиус круга " + getRadius());

    }
}