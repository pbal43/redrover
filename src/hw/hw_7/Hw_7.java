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




        //    4

        System.out.println("===========4===========");



        //    5

        System.out.println("===========5===========");



        //    Extra

        System.out.println("===========Extra===========");



    }

}
