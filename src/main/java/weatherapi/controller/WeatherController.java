package weatherapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weatherapi.service.WeatherApiService;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherApiService weatherApiService;

    @GetMapping("/{city}/current")
    public String getCurrentWeatherByCity(@PathVariable String city) {
        weatherApiService.getCurrentWeather(city);
        return null;
    }

    @GetMapping("/{city}/week")
    public String getWeeklyWeatherByCity(@PathVariable String city) {
        weatherApiService.getWeeklyWeather(city);
        return null;
    }

}
