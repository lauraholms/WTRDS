package scheduler.services;

import scheduler.models.Schedule;

import java.util.List;

public class ReportService {

    public void print(

            List<Schedule> schedules,

            double water

    ) {

        System.out.println();

        System.out.println(

                "Daily Irrigation Report"

        );

        System.out.println(

                "-----------------------"

        );

        System.out.println(

                "Zones: "

                + schedules.size()

        );

        System.out.println(

                "Estimated water: "

                + water

                + " L"

        );

    }

}
