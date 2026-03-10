package weatherapi.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherApiServiceImpl implements WeatherApiService {

    private final RestTemplate restTemplate = new RestTemplate();
    private final String baseUrl = "https://api.openweathermap.org/data/2.5/weather";
    @Value("${weather.api.key}")
    private String api_key;

    @Override
    public void getCurrentWeather(String city) {

    }

    @Override
    public void getWeeklyWeather(String city) {

    }
}
