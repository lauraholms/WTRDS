package scheduler.models;

public class Schedule {

    private String startTime;

    private int durationMinutes;

    private IrrigationZone zone;

    public Schedule(
            String startTime,
            int durationMinutes,
            IrrigationZone zone) {

        this.startTime = startTime;

        this.durationMinutes = durationMinutes;

        this.zone = zone;

    }

    public String getStartTime() {

        return startTime;

    }

    public int getDurationMinutes() {

        return durationMinutes;

    }

    public IrrigationZone getZone() {

        return zone;

    }

}
