package hw.hw_8;

public class Hw_8 {

    public static void main(String[] args) {

//        1.1
        System.out.println("=====1=====");

        Employee_1 employee1 = new Employee_1();
        employee1.setName("Valik");
        System.out.println(employee1.getName());


//        1.2
        System.out.println("=====2=====");

        Manager_1 manager1 = new Manager_1();
        manager1.setDaily_salary(100.0);
        System.out.println(manager1.getSalary(5));
        manager1.setCount_employees(1);
        System.out.println(manager1.getSalary(5));


//        2.1 - 2.2
        System.out.println("=====2.1 - 2.2=====");

        Director_2 director2 = new Director_2();
        director2.setBaseSalary(100.0);
        System.out.println(director2.getSalaryDirector());
        director2.setNumberOfSubordinates(20);
        System.out.println(director2.getSalaryDirector());

//        3
        System.out.println("=====2.1 - 2.2=====");
        Employee_2 employee2_1 = new Employee_2();
        Employee_2 employee2_2 = new Employee_2();
        Employee_2 employee2_3 = new Employee_2();
        employee2_1.setName("Valik");
        employee2_2.setName("Dranik");
        employee2_2.setBaseSalary(200.0);
        employee2_3.setName("Pryanik");
        Employee_2[] employeeArray = {employee2_1, employee2_2, employee2_3};
        Utils_2.searchByName(employeeArray, "dranik"); // нашли работника - Драника - выедем его зп
        System.out.println(Utils_2.searchByName(employeeArray, "dranik"));
        Employee_2 dranik = Utils_2.searchByName(employeeArray, "dranik"); // обозвали экземпляр найденного класса
        // (новое название для старого найденного класса (по сути, еще 1 ссылка на объект employee2_2)
        System.out.println(dranik.getBaseSalary()); // зп драника
        System.out.println(employee2_2.getBaseSalary()); // зп драника = зп employee2_2 (1 и тот же класс)
        // сравним, одинаковые ли объекты для драника и employee2_2 (да)
        System.out.println(dranik);
        System.out.println(employee2_2);


        Employee_2 ik = Utils_2.searchBySubstring(employeeArray, "ik"); // так как для всех 3 есть
        // указанная подстрока - сработает по 1 вхождению (как и в прошлой задаче)
        System.out.println(ik.getName());

        System.out.println("Вывод имен всех объектов (работников) с подстрокой");
        Employee_2[] k = Utils_2.searchBySubstringAll(employeeArray, "ik"); // получили все объекты с подстрокой в имени
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i].getName()); // вывели имена всех объектов с подстрокой
        }
    }
}
