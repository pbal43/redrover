package hw.hw_7;//package hw.hw_7;

import java.util.Locale;

public class Person_hw_7 {

    String name;

    int age;

    String sex;

    String prefix; // можно не создавать поле, а просто возвращать обработанный текст

    String getName() {
        if (sex.equalsIgnoreCase("male")) {
            prefix = "Mr. ";
        } else if (sex.equalsIgnoreCase("female")) {
            prefix = "Mrs. ";
        } else {
            prefix = "";
        }
        String result = prefix + name;
        return result;
    }

    // можно не создавать поле prefix, а просто возвращать обработанный текст

    String getName_new() {
        if (sex.equalsIgnoreCase("male")) {
            return "Mr. " + name;
        } else if (sex.equalsIgnoreCase("female")) {
            return "Mrs. " + name;
        } else {
            return ("" + name);
        }
    }

}
