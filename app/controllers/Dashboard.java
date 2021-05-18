package controllers;

import models.Reading;
import models.Station;
import play.Logger;
import play.mvc.Controller;
import utils.Conversions;

import java.util.List;

public class Dashboard extends Controller
{
  public static void index()
  {
    Logger.info("Rendering Admin");

    List<Station> stations = Station.findAll();

    for (Station station : stations) {
      Reading reading = station.readings.get(station.readings.size() - 1);
      station.weatherFromCode = Conversions.weatherCodeToString(reading.code);
      station.tempC = reading.temperature;
      station.tempF = Conversions.tempToF(reading.temperature);
      station.windBft = Conversions.windToBft(reading.windSpeed);
      station.pressureHPA = reading.pressure;
    }

    render ("dashboard.html", stations);
  }
}
