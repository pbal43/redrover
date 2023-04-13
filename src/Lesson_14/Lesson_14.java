package Lesson_14;

import java.util.ArrayList;

public class Lesson_14 {


    // интерфейс диета еть у собаки и директора

    public static void main(String[] args) {


        Diet[] array = new Diet[] {new Dog("Bobik", "bones"), new Director("John", "KFC")};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("name %s, diet %s \n", array[i].getName(), array[i].getDiet());
            array[i].print();
        }

        // коллекции

        int a = 5;

        ArrayList<String> arrList = new ArrayList<>(); // указали тип объектов в коллекции
        arrList.add("F");
        arrList.add("ERG");
        arrList.add("Y");
        // arrList.add(a);  - не получится из-за стринга
        System.out.println(arrList);
        System.out.println(arrList.get(1));
        arrList.remove(1);
        System.out.println(arrList.size());
        System.out.println(arrList.contains("f")); // false (case)
        System.out.println(arrList.contains("F")); // true

        // Дженерики - обобщенные типы

        Generic<String> str = new Generic<String>("lalal");
        System.out.println(str.getField().toString());


    }
}
