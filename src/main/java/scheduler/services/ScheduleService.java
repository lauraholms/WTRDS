package scheduler.services;

import scheduler.models.IrrigationZone;
import scheduler.models.Schedule;

import java.util.ArrayList;
import java.util.List;

public class ScheduleService {

    private final List<Schedule> schedules =
            new ArrayList<>();

    public ScheduleService() {

        schedules.add(

                new Schedule(

                        "06:00",

                        20,

                        new IrrigationZone(

                                "Front Lawn",

                                120,

                                true

                        )

                )

        );

        schedules.add(

                new Schedule(

                        "19:00",

                        15,

                        new IrrigationZone(

                                "Garden",

                                80,

                                true

                        )

                )

        );

    }

    public List<Schedule> getSchedules() {

        return schedules;

    }

    public void printSchedule() {

        schedules.forEach(item ->

                System.out.println(

                        item.getStartTime()

                        + " | "

                        + item.getZone().getName()

                        + " | "

                        + item.getDurationMinutes()

                        + " min"

                )

        );

    }

}
