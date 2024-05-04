import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime specificDay = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println("Year: " + year1());
        System.out.println("Month: " + month1());
        System.out.println("Day of the month: " + dayOfTheMonth1());
        System.out.println("Day of the week: " + dayOfTheWeek1());
    }

    public static Integer year1() {
        OffsetDateTime specificDay = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int year = specificDay.getYear();
        return year;
    }

    public static Month month1() {
        OffsetDateTime specificDay = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Month month = specificDay.getMonth();
        return month;
    }

    public static Integer dayOfTheMonth1() {
        OffsetDateTime specificDay = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        int dayOfTheMonth = specificDay.getDayOfMonth();
        return dayOfTheMonth;
    }

    public static DayOfWeek dayOfTheWeek1() {
        OffsetDateTime specificDay = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        DayOfWeek dayOfTheWeek = specificDay.getDayOfWeek();
        return dayOfTheWeek;
    }
}