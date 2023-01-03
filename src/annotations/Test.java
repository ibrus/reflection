package annotations;

public class Test {
    //аннотации это специальные комментарии/метки/метаданные для передачи определенной информации

    public static void main(String[] args) {
        Parent p = new Child("Ivan");
        p.showInfo();
    }

}

class Parent{
    String name;

    public Parent(String name){
        this.name = name;
    }

    void showInfo(){
        System.out.println("it is Parent class. Name is " + name);
    }
}

class Child extends Parent{

    public Child(String name){
        super(name);
    }

    void showInfo(){
        System.out.println("It is Child class. Name is " + name);
    }
}
