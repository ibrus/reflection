package enums;
//enum - способ ограничения определенной информации конкретным списком возможнох вариантов
//enum может содержать методы переменные и конструкторы
public class WithoutEnum {
    void dayOfWeek(String dayOfWeek){
        System.out.println("Today is " + dayOfWeek);
    }

    public static void main(String[] args) {
        WithoutEnum today = new WithoutEnum();
        today.dayOfWeek("Privet");
        WithEnum withEnum = new WithEnum(WithEnum.WeekDays.SATURDAY);
        System.out.println(WithEnum.WeekDays.valueOf("MONDAY"));
        WithEnum.WeekDays[] weekDays = WithEnum.WeekDays.values();
    }
}
