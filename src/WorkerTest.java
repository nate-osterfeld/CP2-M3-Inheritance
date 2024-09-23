import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class WorkerTest {
    Person p1;
    Worker w1;

    @BeforeEach
    void setUp() {
        p1 = new Person("Jack", "Smith", "000001", "Mr.", 1988);
        w1 = new Worker(p1, 30);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(w1.calculateWeeklyPay(30), 900.0);
        assertEquals(w1.calculateWeeklyPay(45), 2025.0);
    }

    @Test
    void setHourlyPayRate() {
        w1.setHourlyPayRate(40);
        assertEquals(w1.getHourlyPayRate(), 40);
    }

    @Test
    void toCSV() {
        assertEquals("000001, Jack, Smith, Mr., 1988, 30", w1.toCSV());
    }
}