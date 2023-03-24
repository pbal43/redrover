package Lesson_10;

public class Lesson_10 {

    public static void main(String[] args) {

        // Повторение

        // в public static void main(String[] args) мы передаем список строк, так как через этот метод можно
        // взаимодействовать с кодом через консоль (ввод аргументов в виде строк через нее)

        // если метод перезаписан в классе - наследнике, то даже при приведении к 1 типу вызовется одноименный
        // метод наследника

        Worker worker_manager = new Manager();
        Worker worker_worker = new Worker();
        System.out.println(worker_worker.getSalary());
        System.out.println(worker_manager.getSalary());
        Manager manager = new Manager();
        Worker[] workers = {worker_worker, manager}; // менеджер притвориться воркером, но метод get salary
        // возьмется свой для воркера и свой для менеджера
        int zp = 0;
        for (int i = 0; i < workers.length; i++) {
            zp += workers[i].getSalary();
        }
        System.out.println(zp); // зп воркера + зп менеджера (разная), чтобы была одинаковая - не надо перезаписывать метод,
        // лучше создать новый

        // перезапись массивов

        String[] arr = new String[workers.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = workers[i].getName();
        }

        // создание файлов, файлы мб классами, м создавать классы внутри классов
        // 2 вида классов в классе: inner класс и nested класс
        // nested статический и не особо отличается от обычного
        Lesson_10.B b = new B(); // создали экземпляр с указанием контейнера (Lesson_10). Используются частенько

        Lesson_10 lesson_10 = new Lesson_10(); // для иннер класса сначала надо создать объект контейнера
        Lesson_10.A a = lesson_10.new A(); // создание экземпляра inner класса. Используются очень редко

    }

    public class A { // inner класс
        public void printA() {
            System.out.println("A");
        }
    }

    public static class B { // nested класс
        public void printB() {
            System.out.println("B");
        }
    }

}
