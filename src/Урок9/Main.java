package Урок9;

public class Main {
    public static void main(String[] args) {
//regionStudentBox
        Student student = new Student("Ivan", "Pupkin",
                "Trest", 5.0);
        Aspirant aspirant = new Aspirant("Petr", "Mool",
                "Treat", 6.0, "sigma");
        Box box = new Box(12, 5, 7);
        Box redBox = new ColorBox(3, 65, 12, "red");
        Box oldBox = new HeavyBox(12, 43, 12, 7.5);
        ColorBox blueBox = new ColorBox(43, 12, 87, "blue");
        System.out.println("Ширина коробки " + box.width);
        System.out.println("Цвет коробки " + ((ColorBox) redBox).color);
        System.out.println("Ширина тяжелой коробки " + box.width);
        System.out.println("Ширина синей коробки  " + blueBox.width);
        Box shipBox = new Shipment(5, 9, 43, 6.3, 156.8);
        shipBox.getBoxVolume();
        Student[] s = {student, aspirant};
        for (Student st : s) {
            System.out.println(st.getScholarship());
        }
//endregionStudentBox
        Shape[] shapes = {
                new Circle("blue", 13, 28, 13),
                new Circle("white", 2, 14, 34),
                new Circle("purple", 43, 2, 23),
                new Rectangle("brown", 14, 56, 90, 34)
        };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
