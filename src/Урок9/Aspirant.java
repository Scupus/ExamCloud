package Урок9;

public class Aspirant extends Student {
    String work;


    public Aspirant(String firstName, String lastName, String group, double avgMark, String work) {
        super(firstName, lastName, group, avgMark);
        this.work = work;
    }

    public Aspirant(String work) {
        this.work = work;
    }

    @Override
    public double getScholarship() {
        return avgMark == 6 ? 340 : 280;

    }
}
