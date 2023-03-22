package Lesson_9;

public class Lesson_9 {

    public static void main(String[] args) {

        // Продолжаем про классы

        // мб много вариантов методов с 1 названием (overloading) - берется подходящий

        System.out.println(sum(1, 2, 3)); // использован один из методов с одинаковым названием (походящий по аргументам)

        // конструкторов класса мб сколько угодно (см. person)

        Person john = new Person(); // создал инстанс с конструктором без передачи аргументов
        Person doe = new Person("Doe", 25); // создал инстанс с конструктором с передачей аргументов
        System.out.println("name john = " + john.getName()); // будет null
        System.out.println("name doe = " + doe.getName()); // будет Doe
        Person valik = new Person("valik");
        System.out.println("name valik = " + valik.getName());

        // Полиморфизм (возможность менять поведение)

        //  от предка к потомкам меняется поведение, например, можно видоизменить методы предка (см Employee)

        // потомок может прикинуться родителем

        Person jack = new Employee("serega", 23, 23);
        // тип переменной Person, в которую записан объект - инстанс Employee (объект типа Employee записываем в тип Person)
        // можем использовать методы только для Person. Работает аналогично для одноименных методов
        System.out.println(jack.getAge());
        // System.out.println(jack.getSalary()); // тут ошибка, так как у Person нет такого метода => можно переводить туда-сюда, где есть метод

    }

    // методы с одинаковым названием

    static int sum(int v_1, int v_2) {
        return v_1 + v_2;
    }

    static int sum(int v_1, int v_2, int v_3) {
        return v_1 + v_2 + v_3;
    }

}
