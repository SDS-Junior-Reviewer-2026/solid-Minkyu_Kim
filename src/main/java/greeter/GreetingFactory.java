package greeter;

public class GreetingFactory {

    public GreetingStrategy create(String formality) {
        if ("formal".equals(formality)) {
            return new FormalGreeting();
        } else if ("casual".equals(formality)) {
            return new CasualGreeting();
        } else if ("intimate".equals(formality)) {
            return new IntimateGreeting();
        } else if ("go home".equals(formality)) {
            return new IntimateGreeting();
        } else {
            return new DefaultGreeting();
        }
    }
}