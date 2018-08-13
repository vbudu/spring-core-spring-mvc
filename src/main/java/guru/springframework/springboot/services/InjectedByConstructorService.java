package guru.springframework.springboot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InjectedByConstructorService {
    private final IHelloWorldService helloWorldService;

    @Autowired
    public InjectedByConstructorService(IHelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void getMessage(){
        this.helloWorldService.sayHello();
    }
}
