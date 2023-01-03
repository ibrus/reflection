package enums;

public class WithEnum {


    WeekDays today;

    public WithEnum(WeekDays dayOfWeek){
        today = dayOfWeek;
        dayInfo();
    }

    void dayInfo(){
        switch (today){
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Go to work");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Take a rest");
        }
        System.out.println(today.getMood());
    }

//    enum WeekDays{
//        MONDAY,
//        TUESDAY,
//        WEDNESDAY,
//        THURSDAY,
//        FRIDAY,
//        SATURDAY,
//        SUNDAY;
//    }

    enum WeekDays{
        MONDAY("bad"),
        TUESDAY("bad"),
        WEDNESDAY("so so"),
        THURSDAY("pre good"),
        FRIDAY("good"),
        SATURDAY("alko mood"),
        SUNDAY("hangover mood");

        private String mood;

        WeekDays(String mood){
            this.mood = mood;
        }

        public String getMood(){
            return mood;
        }
    }
}
