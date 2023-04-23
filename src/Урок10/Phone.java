package Урок10;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String n, String m, double w) {
        this(n, m);
        weight = w;
    }

    Phone(String n, String m) {
        number = n;
        model = m;
    }

    Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling " + name + ", number " + number);
        System.out.println("My number " + this.number);
    }
}
