package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Employee {
    String name;
    double salary;


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(){
        salary *= 2;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//@Target показывает область кода к которой может быть применима аннотация
// TYPE - класс интерфейс enum
//METHOD - методы
// FIELD - поля
// PARAMETER - параметры метода или конструктора
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.METHOD)
@interface MyAnnotation{

}
