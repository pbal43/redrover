package hw.hw_7;//package hw.hw_7;

import java.util.Locale;

public class Person_hw_7 {

    String name;

    int age;

    String sex;

    String prefix;

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

}
