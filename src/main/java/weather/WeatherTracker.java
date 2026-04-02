package weather;

public class WeatherTracker {
    String currentConditions;
    //Phone phone;
    //Email email;
    private final NotifierFactory notifierFactory;

    public WeatherTracker() {
        this.notifierFactory = new NotifierFactory();
    }

    public WeatherTracker(NotifierFactory notifierFactory) {
        this.notifierFactory = notifierFactory;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;

        Notifier notifier = notifierFactory.create(weatherDescription);
        String alert = notifier.generateWeatherAlert(weatherDescription);

        System.out.print(alert);
        /*
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = email.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }*/
    }
}