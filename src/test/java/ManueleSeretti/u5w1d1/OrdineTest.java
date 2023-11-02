package ManueleSeretti.u5w1d1;

import ManueleSeretti.u5w1d1.entities.ElementiMenu;
import ManueleSeretti.u5w1d1.entities.Ordine;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdineTest {
    static Ordine ordineTest;
    private static AnnotationConfigApplicationContext ctx;

    @BeforeAll
    static void beforeAll() {
        ctx = new AnnotationConfigApplicationContext(U5W1D3Application.class);
        ordineTest = ctx.getBean(Ordine.class);
        ordineTest.setLista((List<ElementiMenu>) ctx.getBean("getLista"));
        ordineTest.conto();
    }

    @AfterAll
    static void afterAll() {
        ctx.close();
    }

    @Test
    public void contoCopertiTest() {
        double result = ordineTest.contoCoperti();
        assertEquals(6, result);
    }

    @Test
    public void contoTest() {
        double result = ordineTest.getConto();
        assertEquals(31.119999999999997, result);
    }

    @Test
    public void sizeList() {
        List<ElementiMenu> l = ordineTest.getLista();
        assertEquals(8, l.size());

    }
}
