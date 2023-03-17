package Lesson_8;

public class Person {

    String name;

    private int age;

    protected String surname;

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age; // ключевое слово this -
    }

    int getAge() {
        return age;
    }

}
