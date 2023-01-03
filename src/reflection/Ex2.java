package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Class employeeClass = Class.forName("reflection.Employee");
//        Employee o = (Employee)employeeClass.newInstance();

//        Constructor constructor = employeeClass.getConstructor();
//        Employee o1 =  (Employee) constructor.newInstance();

        Constructor constructor1 = employeeClass.getConstructor(int.class, String.class, String.class);
        Employee o1 =  (Employee) constructor1.newInstance(5, "Ivan", "Dev");
        System.out.println(o1);
//
        Method method = employeeClass.getMethod("setSalary", double.class);
        method.invoke(o1, 50.01);
        System.out.println(o1);
    }
}
