package utils;

public class Conversions {

    public static String weatherCodeToString(int code) {
        switch(code) {
            case 100:
                return "Clear";
            case 200:
                return "Partial Clouds";
            case 300:
                return "Cloudy";
            case 400:
                return "Light Showers";
            case 500:
                return "Heavy Showers";
            case 600:
                return "Rain";
            case 700:
                return "Snow";
            case 800:
                return "Thunder";
            default:
                return "UNAVAILABLE";
        }
    }

    public static double tempToF(double temperature) {
        double tempF = (((temperature * 9) / 5) +32);
        tempF = (Math.round(tempF * 10.0) / 10.0);
        return tempF;
    }

    public static int windToBft(double windSpeed) {

        int windBft;

        if (windSpeed <= 1) {
            windBft = 0;
        }
        else if ((windSpeed > 1) && (windSpeed < 6)) {
            windBft = 1;
        }
        else if ((windSpeed >= 6) && (windSpeed < 12)) {
            windBft = 2;
        }
        else if ((windSpeed >= 12) && (windSpeed < 20)) {
            windBft = 3;
        }
        else if ((windSpeed >= 20) && (windSpeed < 29)) {
            windBft = 4;
        }
        else if ((windSpeed >= 29) && (windSpeed < 39)) {
            windBft = 5;
        }
        else if ((windSpeed >= 39) && (windSpeed < 50)) {
            windBft = 6;
        }
        else if ((windSpeed >= 50) && (windSpeed < 62)) {
            windBft = 7;
        }
        else if ((windSpeed >= 62) && (windSpeed < 75)) {
            windBft = 8;
        }
        else if ((windSpeed >= 75) && (windSpeed < 89)) {
            windBft = 9;
        }
        else if ((windSpeed >= 89) && (windSpeed < 103)) {
            windBft = 10;
        }
        else {
            windBft = 11;
        }

        return windBft;
    }
}
