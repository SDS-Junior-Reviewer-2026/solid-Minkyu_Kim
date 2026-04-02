package weather;

public class DefaultNotifier implements Notifier {

    @Override
    public String generateWeatherAlert(String weatherConditions) {
        return "It is " + weatherConditions;
    }
}