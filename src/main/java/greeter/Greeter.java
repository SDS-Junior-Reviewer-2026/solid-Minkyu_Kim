package greeter;

public class Greeter {
    String formality;
    private final GreetingFactory greetingFactory;

    public Greeter() {
        this.greetingFactory = new GreetingFactory();
    }

    public String greet() {
        GreetingStrategy strategy = greetingFactory.create(formality);
        return strategy.greet();
    }

    public void setFormality(String formality) {
        this.formality = formality;
    }
}

/*
    public String greet() {
        if (this.formality == "formal") {
            return "Good evening, sir.";
        } else if (this.formality == "casual") {
            return "Sup bro?";
        } else if (this.formality == "intimate") {
            return "Hello Darling!";
        } else {
            return "Hello.";
        }
  } */