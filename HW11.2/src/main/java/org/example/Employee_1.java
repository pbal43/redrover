package org.example;

public class Employee_1 {

        private String name;
        private int age;
        private String sex;
        private double daily_salary;

        public Employee_1() {
        }

        public String getName() {
            return this.name;
        }

        public int getAge() {
            return this.age;
        }

        public String getSex() {
            return this.sex;
        }

        public double getDaily_salary() {
            return this.daily_salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void setDaily_salary(double daily_salary) {
            this.daily_salary = daily_salary;
        }

        double getSalary(int days) {
            return this.daily_salary * (double)days;
        }

}
