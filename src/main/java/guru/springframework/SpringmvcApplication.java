package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringmvcApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =
                SpringApplication.run(SpringmvcApplication.class, args);
        InjectedByConstructorService injected =
                (InjectedByConstructorService) ctx.getBean("injectedByConstructorService");
        injected.getMessage();
    }
}
