package reflection;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Calc {

    void sum(int a, int b){
        int res = a+b;
        System.out.println("Sum is " + res);
    }

    void substract(int a, int b){
        int res = a-b;
        System.out.println("subtract is " + res);
    }

    void multi(int a, int b){
        int res = a*b;
        System.out.println("multiplication is " + res);
    }

    void div(int a, int b){
        int res = a/b;
        System.out.println("division is " + res);
    }
}

class TestCalc{
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            String methodName = reader.readLine();
            String firstArg = reader.readLine();
            String secondArg = reader.readLine();

            Calc calc = new Calc();
            Class c1 = calc.getClass();
            Method method = null;

            Method[] methods = c1.getDeclaredMethods();
            for (Method method1 : methods) {
                if(method1.getName().equals(methodName)) method1.invoke(calc,Integer.parseInt(firstArg), Integer.parseInt(secondArg));
            }
        } catch (IOException | IllegalAccessException | InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
