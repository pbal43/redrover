package org.example;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    public Utils() {
    }

    public static Employee_2 searchByName(Employee_2[] employeeArray, String name) {
        for(int i = 0; i < employeeArray.length; ++i) {
            if (employeeArray[i].getName().toLowerCase().equals(name.toLowerCase())) {
                return employeeArray[i];
            }
        }

        return null;
    }

    public static Employee_2 searchBySubstring(Employee_2[] employeeArray, String Substring) {
        for(int i = 0; i < employeeArray.length; ++i) {
            if (employeeArray[i].getName().toLowerCase().contains(Substring.toLowerCase())) {
                return employeeArray[i];
            }
        }

        return null;
    }

    public static Employee_2[] searchBySubstringAll(Employee_2[] employeeArray, String Substring) {
        List new_array_list = new ArrayList();

        for(int i = 0; i < employeeArray.length; ++i) {
            if (employeeArray[i].getName().toLowerCase().contains(Substring.toLowerCase())) {
                new_array_list.add(employeeArray[i]);
            }
        }

        Employee_2[] for_return = (Employee_2[])new_array_list.toArray(new Employee_2[0]);
        return for_return;
    }

    public static double calculateSalary(Employee_2[] employeeArray, Manager_2[] managerArray, Director_2[] directorArray) {
        double salary_all = 0.0;
        int i;
        if (employeeArray != null) {
            for(i = 0; i < employeeArray.length; ++i) {
                salary_all += employeeArray[i].getBaseSalary();
            }
        }

        if (managerArray != null) {
            for(i = 0; i < managerArray.length; ++i) {
                salary_all += managerArray[i].getSalaryManager();
            }
        }

        if (directorArray != null) {
            for(i = 0; i < directorArray.length; ++i) {
                salary_all += directorArray[i].getSalaryDirector();
            }
        }

        return salary_all;
    }

    public static double searchMinSalary(Employee_2[] employeeArray) {
        double min_salary = Double.MAX_VALUE;
        if (employeeArray != null) {
            for(int i = 0; i < employeeArray.length; ++i) {
                if (min_salary > employeeArray[i].getBaseSalary()) {
                    min_salary = employeeArray[i].getBaseSalary();
                }
            }
        }

        return min_salary == Double.MAX_VALUE ? 0.0 : min_salary;
    }

    public static double searchMaxSalary(Employee_2[] employeeArray) {
        double max_salary = 0.0;
        if (employeeArray != null) {
            for(int i = 0; i < employeeArray.length; ++i) {
                if (max_salary < employeeArray[i].getBaseSalary()) {
                    max_salary = employeeArray[i].getBaseSalary();
                }
            }
        }

        return max_salary;
    }

    public static int searchMinNumberOfSubordinates(Manager_2[] managerArray) {
        int min_subordinates = Integer.MAX_VALUE;
        if (managerArray != null) {
            for(int i = 0; i < managerArray.length; ++i) {
                if (min_subordinates > managerArray[i].getNumberOfSubordinates()) {
                    min_subordinates = managerArray[i].getNumberOfSubordinates();
                }
            }
        }

        return min_subordinates == Integer.MAX_VALUE ? 0 : min_subordinates;
    }

    public static int searchNumberOfSubordinates(Manager_2[] managerArray) {
        int max_subordinates = 0;
        if (managerArray != null) {
            for(int i = 0; i < managerArray.length; ++i) {
                if (max_subordinates < managerArray[i].getNumberOfSubordinates()) {
                    max_subordinates = managerArray[i].getNumberOfSubordinates();
                }
            }
        }

        return max_subordinates;
    }

    public static double calculateMaxExtraIncome(Manager_2[] managerArray) {
        double max_extra_income = 0.0;
        if (managerArray != null) {
            for(int i = 0; i < managerArray.length; ++i) {
                double extra_income = managerArray[i].getSalaryManager() - managerArray[i].getBaseSalary();
                if (max_extra_income < extra_income) {
                    max_extra_income = extra_income;
                }
            }
        }

        return max_extra_income;
    }

    public static double calculateMinExtraIncome(Manager_2[] managerArray) {
        double min_extra_income = Double.MAX_VALUE;
        if (managerArray != null) {
            for(int i = 0; i < managerArray.length; ++i) {
                double extra_income = managerArray[i].getSalaryManager() - managerArray[i].getBaseSalary();
                if (min_extra_income > extra_income) {
                    min_extra_income = extra_income;
                }
            }
        }

        return min_extra_income == Double.MAX_VALUE ? 0.0 : min_extra_income;
    }
}
