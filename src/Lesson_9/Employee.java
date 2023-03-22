package Lesson_9;

public class Employee extends Person{

    int salary;

    public Employee(String name, int age, int salary) {
        super(name, age); // использовали конструктор непосредственного предка (только от которого наследуемся - Person), можно сделать по цепочке ( указать в других классах)
        this.salary = salary;
    }

    @Override // при перезаписывании метода надо указывать данную аннотацию (эт оверрайд) - правило хорошего тона
    public String getName() { // изменим метод getName в потомке (перезапишем)
        return "New " + super.getName(); // обратимся к методу getName предка
    }

}
