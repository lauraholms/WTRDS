package scheduler.utils;

import scheduler.models.Schedule;

import java.util.List;

public class ConsolePrinter {

    public void print(List<Schedule> schedules) {

        System.out.println();

        System.out.println("Today's Schedule");

        System.out.println("------------------------------");

        for (Schedule schedule : schedules) {

            System.out.printf(
                    "%-12s %-15s %3d min%n",
                    schedule.getStartTime(),
                    schedule.getZone().getName(),
                    schedule.getDurationMinutes()
            );

        }

        System.out.println();

    }

}
