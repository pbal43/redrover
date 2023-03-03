public class Lesson_4 {
    public static void main(String[] args) {

//        повторение if else

        int a = 10;
        a = 11;
        if (a != 0) {
            System.out.println("Hi");
            int b = 5;
        }

//        System.out.println(b); - не выведет, так как b вне области видимости

        if (a == 11) {
            System.out.println("True!");
        } else {
            System.out.println("False!");
        }

        if (a != 10 && a > 5) {
            System.out.println("True!");
        }

        if (a != 10 || a > 5) {
            System.out.println("True!");
        } else {
            if (a == 0) {
                System.out.println("True!");
            }
        }

//  Еще про типы данных

//        вывод символа из таблицы юникода

        System.out.println("\u0021");

//        запись чара в 10-тичной системе (по номеру в таблице юникода)
        char c = 33;
//        запись чара непосредственно символом
        char d = '!';

        System.out.println(c);
        System.out.println(d);
        if (c == d) {
            System.out.println("c == d");
        }
    }
}
