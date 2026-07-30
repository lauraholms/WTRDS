package scheduler.services;

import scheduler.models.Schedule;

import java.util.List;

public class StatisticsService {

    public int totalDuration(

            List<Schedule> schedules

    ) {

        return schedules.stream()

                .mapToInt(

                        Schedule::getDurationMinutes

                )

                .sum();

    }

    public double averageDuration(

            List<Schedule> schedules

    ) {

        return schedules.stream()

                .mapToInt(

                        Schedule::getDurationMinutes

                )

                .average()

                .orElse(0);

    }

}
