package hw.hw_10;

import java.util.Arrays;

public class Hw_10 {

    public static void main(String[] args) {



    }

    public class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            String[] arr = name.split(" ");
            String new_string = (arr[0].toUpperCase().charAt(0)) + "." + (arr[1].toUpperCase().charAt(0));
            return new_string;
        }
    }

}
