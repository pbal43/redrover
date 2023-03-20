package hw.hw_8;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Utils_2 {

    // * поиск сотрудника в массиве по его имени

    // сработает по 1 вхождению
    static Employee_2 searchByName(Employee_2[] employeeArray, String name) { // сделал статик, чтобы не вызывать экземпляр класса
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().toLowerCase().equals(name.toLowerCase())) {
                return employeeArray[i];
            }
        }
        return null;
    }

    // * поиск сотрудника в массиве по вхождению указанной строки в его имени

    // сработает по 1 вхождению
    static Employee_2 searchBySubstring(Employee_2[] employeeArray, String Substring) { // сделал статик, чтобы не вызывать экземпляр класса
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().toLowerCase().contains(Substring.toLowerCase())) {
                return employeeArray[i];
            }
        }
        return null;
    }

    // изменим предыдущий метод, чтобы выдавал все вхождения
    static Employee_2[] searchBySubstringAll(Employee_2[] employeeArray, String Substring) { // сделал статик, чтобы не вызывать экземпляр класса
        List new_array_list = new ArrayList<>();
//        int counter = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().toLowerCase().contains(Substring.toLowerCase())) {
                new_array_list.add(employeeArray[i]);
//                counter++;
            }
        }
        Employee_2[] for_return = (Employee_2[]) new_array_list.toArray(new Employee_2[0]); // почему с 0 объемом тоже работает?
        // Особенность метода (создаст новый массив), а если массив больше - заполнит недостающие значения null'ами
//        return (Employee_2[]) new_array_list.toArray(new Employee_2[counter]);
//        можно закомментить 2 последних авктивных строки и расскомментить остальное
        return for_return;
    }

    // * подсчет зарплатного бюджета для всех сотрудников в массиве

    static double calculateSalary(Employee_2[] employeeArray, Manager_2[] managerArray, Director_2[] directorArray) { // учтем зп как обычных сотрудников, так и менеджмента и директора
        double salary_all = 0.0;
        if (employeeArray != null) { // надо бы учесть null в массиве
            for (int i = 0; i < employeeArray.length; i++) { // тут если поле не заполнено с зп, ошибки не будет (возьмет 0)
                salary_all += (employeeArray[i].getBaseSalary());
            }
        }
        if (managerArray != null) {
            for (int i = 0; i < managerArray.length; i++) {
                salary_all += (managerArray[i].getSalaryManager());
            }
        }
        if (directorArray != null) {
            for (int i = 0; i < directorArray.length; i++) {
                salary_all += (directorArray[i].getSalaryDirector());
            }
        }
        return salary_all;
    }

//    * поиск наименьшей зарплаты в массиве (сделаем для 1 типа массивов)

    static double searchMinSalary(Employee_2[] employeeArray) {
        double min_salary = Double.MAX_VALUE;
        for (int i = 0; i < employeeArray.length; i++) {
            if (min_salary > employeeArray[i].getBaseSalary()) {
                min_salary = employeeArray[i].getBaseSalary();
            }
        }
//        if (min_salary == Double.MAX_VALUE) { // как сделать ретерн другого вида если зп ни у кого? надо изучать Дженерики
//        } // но Java защищает от этого, если зп нет, то ее значение 0.0, поэтому не вернет Double.MAX_VALUE ?? Вернем 0 сами в данном случае
        if (min_salary == Double.MAX_VALUE) {
            return 0.0;
        } else {
            return min_salary;
        }
    }

//    * поиск наибольшей зарплаты в массиве

    static double searchMaxSalary(Employee_2[] employeeArray) {
        double max_salary = Double.MIN_VALUE;
        for (int i = 0; i < employeeArray.length; i++) {
            if (max_salary < employeeArray[i].getBaseSalary()) {
                max_salary = employeeArray[i].getBaseSalary();
            }
        }
        if (max_salary == Double.MIN_VALUE) {
            return 0.0;
        } else {
            return max_salary;
        }
    }



}
