package weather;

public class NotifierFactory {

    public Notifier create(String weatherDescription) {
        if ("rainy".equals(weatherDescription)) {
            return new Phone();
        } else if ("sunny".equals(weatherDescription)) {
            return new Email();
        } else {
            return new DefaultNotifier();
        }
    }
}