package Урок9;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, 3.4);
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return avgMark == 6 ? 340 : 280;

    }
}
