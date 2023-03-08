import java.util.Arrays;

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

/*        Разбирали breakpoints с debug - можно смотреть в консоли и в консоли дебаггера
          Step Over - спуск по шагам

 */

//        Массивы

        int[] array = {10, 100, 1000, 10000};
        System.out.println("Значение в массиве по индексу 1 = " + array[1]);
        // вернет значение по индексу == 100

/*        массивы в Java гомогенные (если int - то все значения имеют тип int
          длина массива не изменяема
          не работает индекс -1 как в python
*/

// выход за пределы массива вызовет ошибку: "out of bounds"

/*      int[] array_new = {10, 100, 1000, 10000};
        System.out.println(array_new[7]);
 */

//      Ссылочные типы - объекты, а у них есть методы

        int[] array_method = {10, 100, 1000, 10000};
        System.out.println(array_method.length); // метод, возвращающий длину массива

//      Переопределение в зависимости от типа

        int e = 10;
        int f = a;
        f = 5;
        System.out.println(e); // e == 10 - сохранит свое значение, так как int не ссылочный тип, а примитивный

        int[] arr1 = {10, 100, 1000, 10000};
        int[] arr2 = arr1; // в arr2 ссылка на один объект с arr1
        arr2[0] = 20; // заменим 0-ой элемент массива по ссылке
        System.out.println("arr1[0] = " + arr1[0]);
        // 0-ой элемент в массиве arr1 стал = 20, заменили так как в массивах arr1 и arr2 - ссылки на ОДИН объект

//        Распечатать массив

        System.out.println(arr1); // распечатает адрес ссылки (id)
        System.out.println(arr2); // одинаковый для arr1 и arr2
        int[] arr3 = {1, 2};
        System.out.println(arr3); // разный для arr3

        System.out.println(Arrays.toString(arr1)); // распечатает содержимое массива строкой

//        Прохождение по массиву с помощью цикла for

        int[] arr_for = {10, 100, 1000, 10000};

        for (int i = 0; i < arr_for.length; i++) {
            System.out.println(i + " -> " + arr_for[i]);
        }

//        Создание объекта

        int[] arr_obj = new int[]{1, 2, 3, 4}; // это не упрощенный вариант, все объекты - ссылочные типы
        int[] arr_obj_1 = new int[10000]; // указывает кол-во элементов в массиве

        int[] arr_5 = new int[6]; // наполним степенью 5 начиная с 0 степени
        for (int i = 0, p = 1; i < arr_5.length; p*= 5, i++) { // инициализировали больше 1 переменной
            arr_5[i] = p;
        }
        System.out.println(Arrays.toString(arr_5));

//        Двумерные массивы (многомерные)

        int [][] arr_arr = { // добавление скобок добавит вложенность
                {1, 10, 100},
                {2, 20},
                {3, 30, 300, 3000}
        };
        System.out.println("arr_arr length = " + arr_arr.length); // = 3

        System.out.println(arr_arr[0][2]); // получим доступ к элементу вложенного массива - выведем 100

        // выведем все элементы этого массива

        System.out.println(Arrays.toString(arr_arr)); // - выведет криво (будут ссылки вместо вложенных масиивов
        System.out.println(Arrays.deepToString(arr_arr)); // - выведет норм - глубоко застрингует

        // Пробегаем по всем элементам двумерного массива с помощью вложенного цикла

        for (int i = 0; i < arr_arr.length; i++) {
            for (int j = 0; j < arr_arr[i].length; j++) { // пробегаем по длине вложенного массива
                System.out.println(arr_arr[i][j]);
            }
        }

    }
}
