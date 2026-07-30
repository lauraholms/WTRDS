# Architecture

```
                 Main
                  │
                  ▼
          ScheduleService
          ┌──────┼──────────┐
          ▼      ▼          ▼
 ForecastService WaterUsage ReportService
          │                  │
          └──────────┬───────┘
                     ▼
            StatisticsService
                     │
                     ▼
             ConsolePrinter
```

## Components

### ScheduleService

Maintains irrigation schedules.

### ForecastService

Provides weather forecast information.

### WaterUsageService

Calculates estimated water consumption.

### ReportService

Creates irrigation reports.

### StatisticsService

Calculates irrigation statistics.
