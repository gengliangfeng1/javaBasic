import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.test"})
public class Application {
    public static void main(String[] args) {
        System.out.println("springboot application start!");
        SpringApplication.run(Application.class,args);
    }
}
