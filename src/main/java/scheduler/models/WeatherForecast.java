package scheduler.models;

public class WeatherForecast {

    private boolean rainExpected;

    private int precipitationMm;

    private int temperature;

    public WeatherForecast(
            boolean rainExpected,
            int precipitationMm,
            int temperature) {

        this.rainExpected = rainExpected;

        this.precipitationMm = precipitationMm;

        this.temperature = temperature;

    }

    public boolean isRainExpected() {

        return rainExpected;

    }

    public int getPrecipitationMm() {

        return precipitationMm;

    }

    public int getTemperature() {

        return temperature;

    }

}
