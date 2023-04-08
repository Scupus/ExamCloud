package Урок9;

public class EmptyConst extends Person{
    public EmptyConst(String fullName, int age, boolean isRetired) {
        super(fullName, age, isRetired);
    }

    public static void main(String[] args) {
        Person person = new Person("tre",5, true);
        System.out.println(person.fullName);
        System.out.println(person.age);
        System.out.println(person.isRetired);
        person.setAge(45);
        person.setFullName("ywdtiuhdb");
        person.setRetired(false);
        System.out.println(person.fullName);
        System.out.println(person.age);
        System.out.println(person.isRetired);
    }
}

