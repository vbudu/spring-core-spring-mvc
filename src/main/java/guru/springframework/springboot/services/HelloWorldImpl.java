package guru.springframework.springboot.services;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements IHelloWorldService {
    public HelloWorldImpl() {
    }

    public void sayHello(){
        System.out.println("Hello World!");
    }
}
