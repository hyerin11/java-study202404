package day08.final_.Quiz;

public class WeatherAnalyzer {
    public static boolean checkTemperatureAlert(double temperature) {
        return temperature > WeatherConstants.MAX_TEMPERATURE_ALERT || temperature < WeatherConstants.MIN_TEMPERATURE_ALERT;
    }

    public static boolean checkPrecipitationAlert(double precipitation) {
        return precipitation > WeatherConstants.PRECIPITATION_ALERT;
    }
}
