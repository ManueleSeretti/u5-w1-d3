package ManueleSeretti.u5w1d1.entities;

import ManueleSeretti.u5w1d1.U5W1D3Application;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class RunnerMenu implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U5W1D3Application.class);
        System.out.println(ctx.getBean("getMenu"));
    }
}
