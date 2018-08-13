package guru.springframework.springboot.services;

public class HelloWorldServiceEnglishImpl implements HelloWorldService {

    @Override
    public String getGreeting() {
        return "Hello World!";
    }
}
