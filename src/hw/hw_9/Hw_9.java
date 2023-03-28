package hw.hw_9;

public class Hw_9 {

    public static void main(String[] args) {

        // перезаписали метод getSalary, теперь можно привести экземпляры разных классов к 1 типу и получить общую зп

//        Employee employee = new Employee(); - не получится, так как сделаны конструкторы с добавлением значений в поля
//        employee.setBaseSalary(100.0);
//        Worker worker = new Worker();
//        worker.setBaseSalary(105.0);
//        Manager manager = new Manager();
//        manager.setBaseSalary(100.0);
//        manager.setNumberOfSubordinates(4);

        Employee employee = new Employee("Vasyan", 100.0);
        Worker worker = new Worker("Petyan", 105.0);
        Manager manager = new Manager("Croissant", 100.0, 4);


        Employee[] array = {employee, worker, manager}; // массив с приведением к 1 типу инстансов разных классов

        double salary_summ = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " " + array[i].getSalary()); // одним методом получаем общую зп, при этом метод работает для каждого экземпляра класса по своему
            salary_summ += array[i].getSalary();
        }
        System.out.println("salary_summ " + salary_summ);
    }

}
