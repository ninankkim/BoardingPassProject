import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        //String name, String email, String phoneNum, char gender, int age
        person = new Person("Steve", "steve@gmail.com", "098-098-0987", 'M', 45);
    }

    @Test
    void getName() {
        assertEquals("Steve", person.getName());

    }

    @Test
    void setName() {
        person.setName("Sally");
        assertEquals("Sally", person.getName(), "The set name has failed!");
    }

    @Test
    void getEmail() {
        assertEquals("steve@gmail.com", person.getEmail());
    }

    @Test
    void setEmail() {
        person.setEmail("sally@gmail.com");
        assertEquals("sally@gmail.com", person.getEmail(), "The set email has failed!");
    }

    @Test
    void getPhoneNum() {
        assertEquals("098-098-0987", person.getPhoneNum());
    }

    @Test
    void setPhoneNum() {
        person.setPhoneNum("123-123-1234");
        assertEquals("123-123-1234", person.getPhoneNum(), "The set phone number has failed!");
    }

    @Test
    void getGender() {
        assertEquals('M', person.getGender());
    }

    @Test
    void setGender() {
        person.setGender('F');
        assertEquals('F', person.getGender(), "The set gender has failed!");
    }

    @Test
    void getAge() {
        assertEquals(45, person.getAge());
    }

    @Test
    void setAge() {
        person.setAge(25);
        assertEquals(25, person.getAge(), "The set age has failed!");
    }

    @Test
    void testToString() {
    }

    @AfterEach
    void tearDown() {
    }
}