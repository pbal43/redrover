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



    }

}
