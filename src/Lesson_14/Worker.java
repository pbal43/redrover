package Lesson_14;

import hw.hw_13.Employee;

public class Worker extends Employee implements inter {
    @Override
    final public int getSalary() {
        return getBaseSalary();
    }
}
