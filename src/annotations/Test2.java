package annotations;

import java.lang.annotation.*;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotations.Xiaomi");
        SmartPhone annotation = (SmartPhone) xiaomiClass.getAnnotation(SmartPhone.class);
        System.out.println("Smartphone info: System: " + annotation.OS() + " year: " + annotation.year());
    }

}

@SmartPhone(year = 2005)
class Xiaomi{
    String model;
    double price;
}

@SmartPhone(OS="IOS", year=1999)
class Iphone{
    String model;
    double price;
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android";
    int year();

}
