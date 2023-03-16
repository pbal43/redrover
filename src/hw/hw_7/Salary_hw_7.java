package hw.hw_7;

public class Salary_hw_7 {

    double getSum(Employee_hw_7[] employeeArray) {
        double sum = 0;
        if (employeeArray.length > 0) {
            for (int i = 0; i < employeeArray.length; i++) {
                sum += employeeArray[i].salary; // сработало даже без проверки на работников с незаполненным полем зп
            }
        }
        return sum;
    }

}
