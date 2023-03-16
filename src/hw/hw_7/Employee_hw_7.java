package hw.hw_7;

public class Employee_hw_7 {

    String name;

    int age;

    String sex;

    String prefix;

    double salary;

    boolean isSameName(Employee_hw_7 employee) {
        if (name.equals(employee.name)) {
        return true;
        } else {
        return false;
        }
    }

}
