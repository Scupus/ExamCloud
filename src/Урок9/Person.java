package Урок9;

public class Person {
    String fullName;
    int age;
    boolean isRetired;

    public Person(String fullName, int age, boolean isRetired) {
        this.fullName = fullName;
        this.age = age;
        this.isRetired = isRetired;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public boolean isRetired() {
        return isRetired;
    }
}
