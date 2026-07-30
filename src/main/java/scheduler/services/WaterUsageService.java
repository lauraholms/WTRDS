package scheduler.services;

import scheduler.models.Schedule;

import java.util.List;

public class WaterUsageService {

    public double calculate(

            List<Schedule> schedules

    ) {

        double total = 0;

        for (Schedule schedule : schedules) {

            total +=

                    schedule.getZone().getArea()

                    * 0.45

                    * schedule.getDurationMinutes();

        }

        return total;

    }

}
