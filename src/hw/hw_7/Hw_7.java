package hw.hw_7;

public class Hw_7 {

    public static void main(String[] args) {

        //    1

        System.out.println("===========1===========");

        Person_hw_7 person = new Person_hw_7();
        person.name = "Diggidi";
        person.sex = "Female";
        String answer_1 = person.getName();
        System.out.println(answer_1);


        //    2

        System.out.println("===========2===========");

        Employee_hw_7 employee_1 = new Employee_hw_7();
        employee_1.name = "Valya";
        Employee_hw_7 employee_2 = new Employee_hw_7();
        employee_2.name = "Valy2a";
        boolean result_2 = employee_1.isSameName(employee_2);
        System.out.println(result_2);

        //    3

        System.out.println("===========3===========");

        Employee_hw_7 employee_3 = new Employee_hw_7();
        employee_3.salary = 228;

        Employee_hw_7 employee_4 = new Employee_hw_7();
        employee_4.salary = 228.5;

        Employee_hw_7 employee_5 = new Employee_hw_7();

        Salary_hw_7 salaries = new Salary_hw_7();

        Employee_hw_7[] empls = {employee_3, employee_4, employee_5};

        double sum_salaries = salaries.getSum(empls);

        System.out.println(sum_salaries);

        //    4

        System.out.println("===========4===========");

//        public class Cube{
//
//            //create a class member integers called "side"
//            private int Side;
//
//            // Get method
//            public int getSide() {
//                return Side;
//            }
//
//            //set method
//            public void setSide(int num){
//                this.Side = num;
//            }
//
//
//        }

        //    5

        System.out.println("===========5===========");



        //    Extra

        System.out.println("===========Extra===========");



    }

}
