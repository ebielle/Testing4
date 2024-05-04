import org.junit.jupiter.api.Test;

import static java.time.DayOfWeek.WEDNESDAY;
import static java.time.Month.MARCH;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void year1() {
        assertEquals(2023, Main.year1());
    }

    @Test
    void month1() {
        assertEquals(MARCH, Main.month1());
    }

    @Test
    void dayOfTheMonth1() {
        assertEquals(1, Main.dayOfTheMonth1());
    }

    @Test
    void dayOfTheWeek1() {
        assertEquals(WEDNESDAY,Main.dayOfTheWeek1());
    }
}