package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@ToString
@Component
public class Tavolo {

    private int nTavolo;

    private int maxCoperti;

    private StatoTavolo stato;

    public Tavolo(@Value("1") int nTavolo, @Value("10") int maxCoperti, @Value("LIBERO") StatoTavolo stato) {
        this.nTavolo = nTavolo;
        this.maxCoperti = maxCoperti;
        this.stato = stato;
    }
}
