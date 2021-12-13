import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardingPassTest {
    BoardingPass boardingPass;
    //String dateToLeave , String origin, String destination, String departureTime, Person person
    @BeforeEach
    void setUp() {
        Person person = new Person();
        boardingPass = new BoardingPass("05-04-2020", "Tampa, Florida", "Seattle, Washington", "4:00 AM", person);
    }

    @Test
    void getBoardingNum() {
    }

    @Test
    void setBoardingNum() {
    }

    @Test
    void getDate() {
        assertEquals("05-04-2020", boardingPass.getDate());
    }

    @Test
    void setDate() {
        boardingPass.setDate("12-25-2020");
        assertEquals("12-25-2020", boardingPass.getDate(), "The set date has failed!");
    }

    @Test
    void getOrigin() {
        assertEquals("Tampa, Florida", boardingPass.getOrigin());
    }

    @Test
    void setOrigin() {
        boardingPass.setOrigin("Chicago, Illinois");
        assertEquals("Chicago, Illinois", boardingPass.getOrigin(), "The set origin has failed!");
    }

    @Test
    void getDestination() {
        assertEquals("Seattle, Washington", boardingPass.getDestination());
    }

    @Test
    void setDestination() {
        boardingPass.setDestination("Columbus, Ohio");
        assertEquals("Columbus, Ohio", boardingPass.getDestination(), "The set destination has failed!");
    }

    @Test
    void getEta() {
    }

    @Test
    void setEta() {
    }

    @Test
    void getDepartureTime() {
        assertEquals("4:00 AM", boardingPass.getDepartureTime());
    }

    @Test
    void setDepartureTime() {
        boardingPass.setDepartureTime("11:30 PM");
        assertEquals("11:30 PM", boardingPass.getDepartureTime(), "The set departure time has failed!");
    }

    @Test
    void getDateToLeave() {
    }

    @Test
    void setDateToLeave() {
    }

    @Test
    void getTicketPrice() {
    }

    @Test
    void setTicketPrice() {
    }

    @Test
    void getPerson() {
    }

    @Test
    void setPerson() {
    }

    @Test
    void testToString() {
    }

    @AfterEach
    void tearDown() {
    }
}