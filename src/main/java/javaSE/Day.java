package javaSE;

public enum Day {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье");

    private String rusName;

    Day(String RusName) {
        this.rusName = RusName;
    }

    public boolean isWeekend(){
        return (name() == SATURDAY.name() || name() == SUNDAY.name());
    }

    public String getRusName(){
        return rusName;
    }
}
