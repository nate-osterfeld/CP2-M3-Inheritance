import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {
    Person p1;
    Worker w1;
    SalaryWorker sw1;

    @BeforeEach
    void setUp() {
        p1 = new Person("Jack", "Smith", "000001", "Mr.", 1988);
        w1 = new Worker(p1, 30);
        sw1 = new SalaryWorker(w1, 75000);
    }

    @Test
    void setAnnualSalary() {
        sw1.setAnnualSalary(80000);
        assertEquals(sw1.getAnnualSalary(), 80000.0);
    }

    @Test
    void calculateWeeklyPay() {
        assertEquals(sw1.calculateWeeklyPay(40), 1442.3076923076924);
    }

    @Test
    void toCSV() {
        assertEquals("000001, Jack, Smith, Mr., 1988, 30, 75000.0", sw1.toCSV());
    }
}