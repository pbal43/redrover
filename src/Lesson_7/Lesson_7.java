package Lesson_7;

public class Lesson_7 {

//    Методы

    public static void sumOfThree(int firstArg, int secondArg, int thirdArg) {
        int sum = firstArg + secondArg + thirdArg;
        System.out.println("сумма 3 аргументов функции = " + sum);
    }

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int sum_1 = a + b;
        System.out.println("sum_1 " + sum_1);

        int c = 10;
        int d = 5;
        int sum_2 = c + d;
        System.out.println("sum_2 " + sum_2);

        int q = 10;
        int w = 10;
        sum(q, w); // используем определенный ниже метод

        sum(1, 3 * 2);

        sumOfThree(1, 1, 1);

//        Классы (их использование)

        //    создаем экземпляр класса из Lesson_7.Lesson_7_classes

        Lesson_7_classes L7c = new Lesson_7_classes();

        //    используем метод класса

        L7c.sumOfFour(1, 5, 5, 5);

        System.out.println("Результат деления = " + L7c.div(5, 2));

        double result_div_sum = L7c.sum_div(5, 2);
        System.out.println(result_div_sum);

        // использование полей класса

        L7c.hi_Name("Pavlik"); // распечатает без пробела (значение поля в классе без него)
        L7c.hi = "Hi! "; // добавим пробел в поле экземпляра класса
        L7c.hi_Name("Pavlik"); // распечатает с пробелом

        // исп. класс Person - создаем инстансы

        Person john = new Person();
        john.name = "John Doe";
        john.age = 25;

        Person jannet = new Person();
        jannet.name = "Jannet Doe";
        jannet.age = 20;

        System.out.println("name: " + john.name + ", age: " + john.age);
        System.out.println("name: " + jannet.name + ", age: " + jannet.age);

        System.out.println(john.getFullInfo()); // используем метод класса для инстанса

    }

//    не важно, в каком месте кода будет класс и метод (вверху или внизу). Метод пишется с маленькой буквы и начинается с глагола

    public static void sum(int first, int second) {
        int sum = first + second;
        System.out.println("сумма 2 аргументов функции = " + sum);
    }

}
