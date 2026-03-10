package weatherapi.service;

public interface WeatherApiService {

    void getCurrentWeather(String city);

    void getWeeklyWeather(String city);
}
