package Lesson_14;

public interface Diet {

    public String getDiet();

    String getName();

    default void print() {
        System.out.printf("name %s, diet %s \n", getName(), getDiet());
    }

}
