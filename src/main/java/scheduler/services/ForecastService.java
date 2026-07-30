package scheduler.services;

import scheduler.models.WeatherForecast;

public class ForecastService {

    public WeatherForecast today() {

        return new WeatherForecast(

                false,

                1,

                26

        );

    }

    public boolean shouldSkipWatering(

            WeatherForecast forecast

    ) {

        return forecast.isRainExpected()

                &&

                forecast.getPrecipitationMm() >= 5;

    }

}
