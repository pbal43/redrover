package hw.hw_10;

import java.util.Arrays;

public class Hw_10 {

    public static void main(String[] args) {

        System.out.println(TrafficLights.updateLight("yellow"));

    }

    public class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            String[] arr = name.split(" ");
            String new_string = (arr[0].toUpperCase().charAt(0)) + "." + (arr[1].toUpperCase().charAt(0));
            return new_string;
        }
    }

    public class TrafficLights {

        public static String updateLight(String current) {
            String[] lights = {"green", "yellow", "red"};
            for (int i = 0; i < lights.length; i++) {
                if (current.equals(lights[i]) && !current.equals("red")) {
                    return lights[i+1];
                }
            }
            return "green";
        }
    }

}
