import java.sql.SQLOutput;
import java.util.Arrays;

public class Lesson_6 {
    public static void main(String[] args) {

//        Поиск минимального и максимального значения в массиве

        int[] array = {10, 2, 3, 8, 2, 4, 6};
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (result > array[i]) {
                result = array[i];
            }
        }
        System.out.println("min " + result);

        int[] array_1 = {1, 2, 3, 8, 2, 4, 6};
        int result_1 = array_1[0];
        for (int i = 0; i < array_1.length; i++) {
            if (result_1 < array_1[i]) {
                result_1 = array_1[i];
            }
        }
        System.out.println("max " + result_1);

//        Сумма всех элементов в массиве

        int[] array_2 = {1, 2, 3, 8, 2, 4, 6};
        int sum = 0;
        for (int i = 0; i < array_2.length; i++) {
            sum += array_2[i];
        }
        System.out.println("sum " + sum);

//        Счетчик (количество) элементов в массиве (хотя можно просто взять длину массива)

        int[] array_3 = {1, 2, 3, 8, 2, 4, 6};
        int count = 0;
        for (int i = 0; i < array_3.length; i++) {
            count++;
        }
        System.out.println("count " + count);

//        Поиск суммы всех элементов в двумерном массиве

        int[][] arr = {
                {1, 5},
                {3, 8, 2},
                {},
                {6}
        };
        int sum_all = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum_all += arr[i][j];
            }
        }
        System.out.println("sum_all " + sum_all);

//        Минимум в двумерном

        int[][] arr_min = {
                {1, 5},
                {3, 8, 2},
                {},
                {6}
        };
        int min_all = arr_min[0][0];
        for (int i = 0; i < arr_min.length; i++) {
            for (int j = 0; j < arr_min[i].length; j++) {
                if (min_all > arr_min[i][j]) {
                    min_all = arr_min[i][j];
                }
            }
        }
        System.out.println("arr_min " + min_all);

//        Создание объектов

        int[] arr_new = new int[]{1, 2, 3, 4}; // можем поменять элементы, но не длину
        int[] arr_new_2 = arr_new;
        arr_new_2[0] = 20;
        System.out.println(arr_new);

        String str = "Hello"; // ничего нельзя менять
        String str_2 = str; // 1 объект
        System.out.println(str_2);
        str_2 = "hi"; // создание нового объекта
        System.out.println(str_2);
        System.out.println(str);

        Integer a = 10; // объект, reference type
        int b = 50; // не объект, а value type переменная

        Long l = 10L;
        long l_1 = 10;

        Double d = 10.0;
        double d_1 = 1;

//        Методы

        Integer[] a_new = new Integer[5];
        int[] b_new = new int[5];

        System.out.println("a_new " + Arrays.toString(a_new)); // null - допустимо для объектов
        System.out.println("b_new " + Arrays.toString(b_new));

//        int qq = null; - тут ошибка

        String for_index = null;
        String really_for_index = "lol";

//        System.out.println("for_index " + for_index.indexOf(null)); тут ошибка - нет вообще индексов
//        (Cannot invoke "String.indexOf(String)" because "for_index" is null)
        System.out.println("for_index " + really_for_index.indexOf("o"));

        Integer a_2 = 10;
        Integer b_2 = 10;
        if (a_2 == b_2) { // сработает анбоксинг - из объектов автоматически достанутся значения сравнятся
            System.out.println("a_2 == b_2");
        }

//        Методы строк

        String str_methods = "Sergey";
        String str_methods_2 = str_methods.toLowerCase(); // метод приводящий к lower case, не меняющий исходную строку
        // (функция, вызывающаяся от объекта Строки)
        System.out.println("str_methods.toLowerCase "+ str_methods_2);
        System.out.println("str_methods " + str_methods);

        // но строку можно перезаписать:
        String str_methods_3 = "Sergey";
        str_methods_3 = str_methods_3.toLowerCase(); // перезаписал в эту же переменную
        System.out.println("str_methods_3.toLowerCase "+ str_methods_3);

        String str_methods_4 = "Sergey";
        str_methods_4 = str_methods_4.replace('e', 'a'); // перезаписал в эту же переменную
        // с заменой чаров
        System.out.println("str_methods_4.toLowerCase "+ str_methods_4);

        String str_methods_5 = "Sergey is a programmer";
        str_methods_5 = str_methods_5.replace("programmer", "good guy"); // перезаписал в эту же переменную
        // с заменой подстроки
        System.out.println("str_methods_5.toLowerCase "+ str_methods_5);

//        Еще поработаем с массивами

        int[] arr_n = {10, 5, 3, 8, 2, 6};
        int min_n = arr_n[0];
        int[] arr_n_0 = {};
        int min_n_0 = Integer.MAX_VALUE; // если будет макс значение integer, то при пустом массиве перезапишем
        // при поиске мин значения (нельзя взять arr_n_0[0] - будет ошибка)
        int max_n_0 = Integer.MIN_VALUE;
        int max_n = Integer.MIN_VALUE;
        for (int i = 0; i < arr_n.length; i++) {
            if (max_n < arr_n[i]) {
                max_n = arr_n[i];
            }
        }
        System.out.println("max_n " + max_n);


        Integer ee = 10;
        System.out.println("ee " + ee.doubleValue());


//        Еще про строки

        String str_m = "Sergey is a programmer";
        for (int i = 0; i < str_m.length(); i++) {
            System.out.println(str_m.charAt(i));
        }

//

        int[] arr_k_1 = {1, 2, 3};
        int[] arr_k_2 = arr_k_1;
        int[] arr_k_3 = {1, 2, 3};
        System.out.println(arr_k_1 == arr_k_2); // будет True - один объект
        System.out.println(arr_k_1 == arr_k_3); // будет False - разные объекты, поэтому используем
//        Эквивалентность (как для массивов, так и для строк...)

        System.out.println("equals arr " + Arrays.equals(arr_k_1, arr_k_3)); // будет true, использована эквивалентность
        // для массивов с использоанием значений

//        но для Int, так как значения -128...127 - уже сохранены в объекте java по стандарту:

        Integer a_k_1 = 10;
        Integer b_k_1 = 10;
        System.out.println(a_k_1 == b_k_1); // тут будет True,  так как и там и там хранится 1 объект
        // (автоматом создается заранее)

        Integer a_k_2 = 1000;
        Integer b_k_2 = 1000;
        System.out.println(a_k_2 == b_k_2); // тут будет False, объекты разные (вне диапазона сохраненных)

//        ДЛЯ СРАВНЕНИЯ ЗНАЧЕНИЙ ОБЪЕКТА НУЖНО ИСПОЛЬЗОВАТЬ EQUAL, == - только для сравнения самих объектов

//        Пройти массив с конца до начала

        int[] arr_j = {1, 5, 6, 8, 10, 2};
        for (int i = arr_j.length - 1; i >= 0; i--) {
            System.out.println(arr_j[i]);
        }

        // или (дичь устаревшая)

        int[] arr_j_2 = {1, 5, 6, 8, 10, 2};
        for (int i = arr_j_2.length; --i >= 0; ) {
            System.out.println(arr_j_2[i]);
        }

    }
}
