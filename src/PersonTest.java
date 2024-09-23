import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
class PersonTest {
    Person p1, p2;

    @BeforeEach
    void setUp() {
        p1 = new Person("Jack", "Smith", "000001", "Mr.", 1988);
        p2 = new Person("Josh", "Hudson", "000002", "Mr.", 1980);
    }


    @org.junit.jupiter.api.Test
    void setFirstName() {
        p1.setFirstName("Jim");
        assertEquals("Jim", p1.getFirstName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        p1.setLastName("Johnson");
        assertEquals("Johnson", p1.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setID() {
        p1.setID("000002");
        assertEquals("000002", p1.getID());
    }

    @org.junit.jupiter.api.Test
    void setTitle() {
        p1.setTitle("Ms");
        assertEquals("Ms", p1.getTitle());
    }

    @org.junit.jupiter.api.Test
    void setYOB() {
        p1.setYOB(1990);
        assertEquals(1990, p1.getYOB());
    }

    @org.junit.jupiter.api.Test
    void fullName() {
        p1.setFirstName("Josh");
        p1.setLastName("Hudson");
        assertEquals("Josh Hudson", p1.fullName());
    }

    @org.junit.jupiter.api.Test
    void formalName() {
        p1.setTitle("Mr.");
        p1.setFirstName("Josh");
        p1.setLastName("Hudson");
        assertEquals("Mr. Josh Hudson", p1.formalName());
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
        assertEquals("000001, Jack, Smith, Mr., 1988", p1.toCSV());
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        p1.setID("000002");
        p1.setFirstName("Josh");
        p1.setLastName("Hudson");
        p1.setTitle("Mr.");
        p1.setYOB(1980);
        assertEquals(p1, p2);
    }
}