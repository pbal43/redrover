package Lesson_7;

public class Person {

    String name; // если в инстансе не заполнить поля, то тут будет храниться null
    int age;

    String getFullInfo() {
        return "name: " + name + ", age: " + age;
    }

}
