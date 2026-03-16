package w5;

import java.util.Scanner;

class Weather {

    static class Forecast {

        static String predict(double temperature, double humidity) {

            if (temperature > 30 && humidity < 60)
                return "Sunny";
            else if (humidity > 70)
                return "Rainy";
            else
                return "Cloudy";
        }
    }
}

public class WeatherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter City Name: ");
        String city = sc.nextLine();

        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter Humidity: ");
        double humidity = sc.nextDouble();

        String result = Weather.Forecast.predict(temp, humidity);

        System.out.println("Weather Forecast for " + city + ": " + result);

        sc.close();
    }
}