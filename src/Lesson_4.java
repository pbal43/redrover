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

//        вывод символа из таблицы юникода в 16-тиричной системе исчиления (на это указывает u)

        System.out.println("\u0021");

//        запись чара в 10-тичной системе (по номеру в таблице юникода) - просто в константе - всегда 10-тиричная
        char c = 33;
//        запись чара непосредственно символом
        char d = '!';

        System.out.println(c);
        System.out.println(d);
        if (c == d) {
            System.out.println("c == d");
        }

//  Цикл for

//      1 значение в заголовке цикла - до начала цикла, 2 - перед началом каждой итерации, 3 - всегда после каждой итерации
        // 1
        for (int i = 0; i < 5; i += 1) { // 2 но если будет фолс - сразу прерывается
            System.out.println("Hi_" + (i+1));
        } // 3
        System.out.println("End");

        for (int i = 0; i < 5 && i == 3; i += 1) {
            System.out.println("Hi_" + (i+1));
        }
        System.out.println("End");

//  Цикл while (while do) - цикл с предусловием - проверка условия сразу

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            System.out.println("Hello while do");
            i += 1;
        }

//  Цикл while (do while) - цикл с постусловием - выполнится как минимум 1 итерация до проверки условия

        i  = 5;
        do {
            System.out.println("Hello do while");
        } while (i < 5);

//        shift + f6 при выделении переменной - групповое переименование

    }
}
