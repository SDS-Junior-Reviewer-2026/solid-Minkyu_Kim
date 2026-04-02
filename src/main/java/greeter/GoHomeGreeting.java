package greeter;

public class GoHomeGreeting implements GreetingStrategy {
    @Override
    public String greet() {
        return "go home.";
    }
}
