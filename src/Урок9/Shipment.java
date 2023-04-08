package Урок9;

public class Shipment extends HeavyBox{
    double price;

    public Shipment(int width, int length, int height, double weight, double price) {
        super(width, length, height, weight);
        this.price = price;
    }
}
