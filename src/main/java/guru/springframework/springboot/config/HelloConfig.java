package guru.springframework.springboot.config;

import guru.springframework.springboot.services.HelloWorldService;
import guru.springframework.springboot.services.HelloWorldServiceEnglishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile({"default","english"})
    public HelloWorldService helloWorldServiceEnglish(){
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish(){
        return new HelloWorldServiceEnglishImpl();
    }
}
