public class Lesson_5 {
    public static void main(String[] args) {

//        Унарные и иные операторы

        int a = 0;
        a++;
        a--;
        a += 1;
        a -= 1;
        System.out.println("a = " + a);

//        прединкремент/декремент:

        int b = 0;
        System.out.println("прединкремент b = " + (++b));
        System.out.println("b = " + b);

//        постинкремент

        int d = 0;
        System.out.println("постинкремент d = " + (d++));
        System.out.println("d = " + d);

//      Операторы в циклах

        for (int i = 0; i < 10; i++) { // далее используем такую запись при инкременте на 1
            System.out.println(i);
        }

        for (int i = 0; i < 10; i+= 2) {
            System.out.println(i);
        }

//        Break - останавливает цикл (можно выбирать определенный цикл) and Continue (передаем на следующую итерацию)

        for (int i = 1; i < 16; i++) {
            System.out.println(i);
            if (i % 7 == 0) {
                break;
            }
        }

        for (int i = 1; i < 16; i++) {
            if (i % 7 == 0 || i % 14 == 0) {
                continue;
            }
            System.out.println(i); // не распечатает 7 и 14, уйдет на следующую итерацию из-за continue выше
        }

//        Вложенные циклы

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("i = " + i + ", j = " + j); // для каждого i будет выведены все значения j
                // берем i и после перебора всех j - переходим к следуюущему i
            }
        }


    }
}
