package guru.springframework.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Ola mundo!";
    }
}
