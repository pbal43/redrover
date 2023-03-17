package Lesson_8;

public class Person {

    String name;

    private int age;

    protected String surname;

    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age; // ключевое слово this - объект в классе (тут указывает именно на переменную в экземпляре класса)
        // можно и без этого в сеттере, но тогда название аргумента и поля должны отличаться, но в Java так не делают
    }

    int getAge() {
        if (name.equals("Anna")) {
            return 16; // на примере показано, зачем доступ к полям - через методы - то есть их можно настроить для доступа
        } else {
            return age; // в геттере можно не использовать this (тут не записываем в поле)
        }
    }

}
