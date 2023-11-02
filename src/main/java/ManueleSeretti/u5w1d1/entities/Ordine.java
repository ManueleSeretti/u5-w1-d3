package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.List;
import java.util.Random;

@Getter
@Setter
@ToString
@Component("Order_Component")
@PropertySource("application.properties")
public class Ordine {

    private int id;
    private Tavolo tavolo;
    private LocalTime ora;
    private StatoOrdine stato;
    private int coperti;
    private List<ElementiMenu> lista;
    private double conto;
    @Value("${prezzo.coperto}")
    private double prezzo_coperto;

    public Ordine(Tavolo tavolo, @Value("4") int coperti) {
        Random rndm = new Random();
        this.id = rndm.nextInt(1000, 9999);
        this.tavolo = tavolo;
        this.ora = LocalTime.of(20, 00);
        this.coperti = coperti;
        this.stato = StatoOrdine.IN_CORSO;

    }

    public void conto() {
        this.lista.forEach(e -> this.conto = this.conto + e.getPrezzo());
        this.conto = this.conto + (coperti * (prezzo_coperto));
    }
}
