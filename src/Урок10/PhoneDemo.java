package Урок10;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("8 065 233 6115","Samsung",4.5);
        Phone phone3 = new Phone("8 236 541 7895","Apple");
        System.out.println(phone1.number);
        System.out.println(phone1.model);
        System.out.println(phone1.weight);
        System.out.println();
        System.out.println(phone2.number);
        System.out.println(phone2.model);
        System.out.println(phone2.weight);
        System.out.println();
        System.out.println(phone3.number);
        System.out.println(phone3.model);
        System.out.println(phone3.weight);
        phone1.receiveCall("Mother");
        phone2.receiveCall("Brother", "8-764-562-3489");
    }
}
