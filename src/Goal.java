import java.time.LocalDate;
public class Goal {
    LocalDate date;
    String name;
    int bonus;

    public Goal(int year, int month, int dayOfMonth, String name, int bonus){
        this.date = LocalDate.of(year, month, dayOfMonth);
        this.name = name;
        this.bonus = bonus;
    }
    static int getCurrentMonth() {
        return LocalDate.now().getMonthValue();
    }
    static int getCurrentYear() {
        return LocalDate.now().getYear();
    }
    boolean goalsAchived() {
        return (date.getYear() == getCurrentYear()) && (date.getMonthValue() == getCurrentMonth());

    }
}
