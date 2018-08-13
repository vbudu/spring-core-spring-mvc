package guru.springframework;

import guru.springframework.springboot.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(SpringmvcApplication.class, args);
        /*InjectedByConstructorService injected =
                (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injected.getMessage();*/
        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        greetingController.sayHello();
    }
}
