package scheduler;

import scheduler.services.ScheduleService;

public class Main {

    public static void main(String[] args) {

        ScheduleService service =
                new ScheduleService();

        System.out.println(
                "Irrigation Scheduler");

        System.out.println(
                "====================");

        service.printSchedule();

    }

}
