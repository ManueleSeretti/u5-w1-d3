package ManueleSeretti.u5w1d1;

import ManueleSeretti.u5w1d1.entities.Pizze;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class pizzaTest {
    static Pizze pizzaTest;
    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void beforeAll() {
        ctx = new AnnotationConfigApplicationContext(U5W1D3Application.class);
        pizzaTest = (Pizze) ctx.getBean("getPizzaMargherita");
    }

    @AfterAll
    static void afterAll() {
        ctx.close();
    }

    @Test
    public void testNotNull() {
        assertNotNull(pizzaTest);
    }

    @Test
    public void testIsSame() {
        Pizze p = (Pizze) ctx.getBean("getPizzaMargherita");
        assertSame(p, pizzaTest);
    }
}
