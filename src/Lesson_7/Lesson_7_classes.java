package Lesson_7;

public class Lesson_7_classes {

//    Классы

    void sumOfFour(int firstArg, int secondArg, int thirdArg, int fourthArg) { //void - ничего не возвращает
        int sum = firstArg + secondArg + thirdArg + fourthArg;
        System.out.println("сумма 4 аргументов функции = " + sum);
    }

    double div(int firstArg, int secondArg) {
        double result_div = 1.0 * firstArg / secondArg;
        return result_div;
    }

    // использование метода в этом же классе внутри другого метода, а можно еще передавать как аргумент

    double sum_div(int first, int second) {
        double result = div(first, second) + 1;
        return result;
    }

    // поля класса

    String hi = "Hi!";

    void hi_Name(String name) {
        System.out.println(hi + name);
    }


}
