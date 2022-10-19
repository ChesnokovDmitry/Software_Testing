package lesson_8;

import lesson_8.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException, SQLException;
}
