package Lesson_8;

public class Lesson_8 {

    public static void main(String[] args) {

//        OOP

        // наследование классов

        Worker worker_1 = new Worker();
        worker_1.name = "Pavlik"; // имя - из класса - предка (родителя) Worker'а - Person
        System.out.println(worker_1.name);
        System.out.println(worker_1.getName());

        // нет множественного наследования

        // первоначально все классы наследуются от Object (супер класс)

        // инкапсуляция (сокрытие) в рамках класса - исп. модификатор доступа к полям класса (часто - private)

//        worker_1.age = 25; будет ошибка - атрибут не передан наследнику
        worker_1.setAge(25);
//        System.out.println(worker_1.age); // аналогичная ошибка - нужно забрать значение переменной через метод
        System.out.println(worker_1.getAge());

        // public - доступ без ограничений - бывает
        // default package, package-public etc - если ничего не указано, если класс в другом package - надо переносить в 1 пакет
            // импорт поможет только "увидеть" другой класс", но не увидит поле с package
        // private - доступен для работы только в классе - чаще всего
        // protected - доступно наследникам:

        worker_1.surname = "Kink"; // можно, так как у наследника есть доступ к protected полю
        System.out.println(worker_1.getSurname());

        // поговорим о полях и методах класса
        // чаще всего поля - private, поэтому используются аксессоры - методы сеттеры и геттеры (установка и получение значения поля)
        // сеттеры и геттеры - публичные

        Worker worker_2 = new Worker();
        Worker worker_3 = new Worker();
        worker_2.name = "Anna";
        worker_2.setAge(25);
        worker_3.name = "Sergey";
        worker_3.setAge(40);
        System.out.println("Anna's age is always " + worker_2.getAge()); // выведет 16 (см. условия метода)
        System.out.println("Sergey's age is " + worker_3.getAge()); // выведет 40

        // конструктор - особый метод класса, который вызывается при создании экземпляра (в скобках передается параметр)
            // всегда имеет имя класса и идет после полей
            // если есть у предка, должен быть и у наследника (см. Worker_1)

        Person_1 person_constr = new Person_1("Eminem", 36);
        System.out.println(person_constr.name + ", " + person_constr.getAge());

        // immutable - неизмеяемый - удалим из Person_1 сеттеры => значения полей можно задать только при создании экземпляра

        // через cmd+n на маке можно вызвать конструктор или геттеры и сеттеры
        // cmd+click - перейдет по методу

    }

}
