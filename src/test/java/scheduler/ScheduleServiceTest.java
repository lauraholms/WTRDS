package scheduler;

import org.junit.jupiter.api.Test;
import scheduler.services.ScheduleService;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleServiceTest {

    @Test
    void shouldContainSchedules() {

        ScheduleService service = new ScheduleService();

        assertFalse(service.getSchedules().isEmpty());

    }

    @Test
    void shouldLoadTwoSchedules() {

        ScheduleService service = new ScheduleService();

        assertEquals(
                2,
                service.getSchedules().size()
        );

    }

}
