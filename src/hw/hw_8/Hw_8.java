package hw.hw_8;

import java.sql.SQLOutput;

public class Hw_8 {

    public static void main(String[] args) {

//        1
        System.out.println("=====1=====");

        Employee employee = new Employee();
        employee.setName("Valik");
        System.out.println(employee.getName());


//        2
        System.out.println("=====2=====");

        Manager manager = new Manager();
        manager.setDaily_salary(100.0);
        manager.setCount_employees(1);
        System.out.println(manager.getSalary(5));

    }
}
