package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex1 {
    //Рефлексия - механизм исследования данных о программе во время её выполнения
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class employeeClass = Class.forName("reflection.Employee");
        Class employeeClass2 = Employee.class;
        Class employeeClass3 = new Employee().getClass();

//        Field someField = employeeClass.getField("id");
//        System.out.println("Type of id field is " + someField.getType());
//        System.out.println("************");

//        Field[] fields = employeeClass.getFields();
//        for (Field field : fields) {
//            System.out.println("Type of " + field.getName() + " = " + field.getType());
//        }

//        Field[] allFields = employeeClass.getDeclaredFields();
//        for (Field field : allFields) {
//            System.out.println("Type of " + field.getName() + " = " + field.getType());
//        }

//        Method method = employeeClass.getMethod("increaseSalary");
//        System.out.println("method return type is " + method.getReturnType() + ", parameter types :" + Arrays.toString(method.getParameterTypes()));

//        Method method2 = employeeClass.getMethod("setSalary", double.class);
//        System.out.println("method return type is " + method2.getReturnType() + ", parameter types :" + Arrays.toString(method2.getParameterTypes()));

//        Method[] methods = employeeClass.getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println("method name is " + method.getName() +", method return type is " + method.getReturnType() + ", parameter types :" + Arrays.toString(method.getParameterTypes()));
//        }

        Constructor constructor = employeeClass.getConstructor();
        System.out.println("Constructor has " + constructor.getParameterCount() + " parameters, their types: " + Arrays.toString(constructor.getParameterTypes()));
    }

}
