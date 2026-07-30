# Internal API

## ScheduleService

### getSchedules()

Returns all configured irrigation schedules.

### printSchedule()

Prints the current schedule.

## ForecastService

### today()

Returns today's weather forecast.

### shouldSkipWatering(forecast)

Checks whether watering should be skipped.

## WaterUsageService

### calculate(schedules)

Calculates estimated water usage.

## StatisticsService

### totalDuration(schedules)

Returns total watering duration.

### averageDuration(schedules)

Returns average watering duration.
