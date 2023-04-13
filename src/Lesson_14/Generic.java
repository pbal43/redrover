package Lesson_14;

public class Generic <T> {   //<T> == <Type>

    public void setField(T field) {
        this.field = field;
    }

    public T getField() {
        return field;
    }

    private T field;

    public Generic(T field) {
        this.field = field;
    }

}
