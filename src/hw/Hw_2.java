package hw;

public class Hw_2 {

//    1

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        int sum_a_b = a + b;
        System.out.println("a + b = " + sum_a_b);

        int multiple_a_b = a * b;
        System.out.println("a * b = " + multiple_a_b);

        int subtraction_a_b = a - b;
        System.out.println("a - b = " + subtraction_a_b);
//        тут бы получить с десятичными
        double division_a_b = (double) a / b;
        System.out.println("a / b = " + division_a_b);

//    2

        int mod_a_div_b = a % b;
        System.out.println("remainder of division: a / b = " + mod_a_div_b);

        if (a % 2 == 0)
            System.out.println("a - even");
        if (a % 2 != 0)
            System.out.println("a - odd");

        if (b % 2 == 0)
            System.out.println("b - even");
        if (b % 2 != 0)
            System.out.println("b - odd");

//    3

        System.out.println("☺");

    }
}
