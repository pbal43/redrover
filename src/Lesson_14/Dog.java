package Lesson_14;

public class Dog implements Diet {

    private String name;

    private String diet;

    public String getName() {
        return name;
    }

    public Dog(String name, String diet) {
        this.name = name;
        this.diet = diet;
    }

    @Override
    public String getDiet() {
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public void print() {
        System.out.println("Dog: ");
        Diet.super.print();
    }

}
