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
//        int counter = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getName().toLowerCase().contains(Substring.toLowerCase())) {
                new_array_list.add(employeeArray[i]);
//                counter++;
            }
        }
        Employee_2[] for_return = (Employee_2[]) new_array_list.toArray(new Employee_2[0]); // почему с 0 объемом тоже работает?
        // Особенность метода (создаст новый массив), а если массив больше - заполнит недостающие значения null'ами
//        return (Employee_2[]) new_array_list.toArray(new Employee_2[counter]); можно закомментить 2 последних авктивных строки и расскомментить остальное
        return for_return;
    }

}
