package hw.hw_8;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Utils_2 {

    // сработает по 1 вхождению
    static Employee_2 searchByName(Employee_2[] employeeArray, String name) { // сделал статик, чтобы не вызывать экземпляр класса
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().toLowerCase().equals(name.toLowerCase())) {
                return employeeArray[i];
            }
        }
        return null;
    }

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
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().toLowerCase().contains(Substring.toLowerCase())) {
                new_array_list.add(employeeArray[i]);
            }
        }
        Employee_2[] for_return = new Employee_2[0];
        return (Employee_2[]) new_array_list.toArray(for_return);
    }

}
