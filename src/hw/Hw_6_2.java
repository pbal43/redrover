package hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw_6_2 {
    public static void main(String[] args) {

//        1

        System.out.println("===========1===========");

        String s1 = "Перестановочный алгоритм быстрого действия";
        String result1 = "";
        char example1 = 'о';
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == example1) {
                result1 += s1.charAt(i);
            }
        }
        System.out.println(result1);

//        2

        System.out.println("===========2===========");

        String s2 = "Перевыборы выбранного президента";
        char example2 = 'е';
        int count2 = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == example2) {
                count2++;
            }
        }
        System.out.println(count2);

//        3

        System.out.println("===========3===========");

        String s3_1 = "Посмотрите как Рите нравится ритм";
        String s3_1_lower = s3_1.toLowerCase();
        String substring3_1 = "рит";
        int index = s3_1_lower.indexOf(substring3_1);
        while (index != -1) {
            System.out.println(index);
            index = s3_1_lower.indexOf(substring3_1, index + 1);
        }


//        или

        String s3_2 = "Посмотрите как Рите нравится ритм";
        String s3_2_lower = s3_2.toLowerCase();
        String substring3_2 = "рит";
        Matcher matcher = Pattern.compile(substring3_2).matcher(s3_2_lower);
        while (matcher.find()) {
            System.out.println(matcher.start());
        }

//        Extra

        System.out.println("===========Extra===========");

        String[][] array_extra = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int counter_extra = 0;
        for (int i = 0; i < array_extra.length; i++) {
            for (int j = 0; j < array_extra[i].length; j++) {
                if ((array_extra[i][j].contains("е")) == false) {
                    counter_extra++;
                }
            }
        }
        System.out.println(counter_extra);

    }
}
