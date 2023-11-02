package ManueleSeretti.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class menu {
    private List<Pizze> pizze;
    private List<Toppings> toppings;
    private List<Drinks> bevande;

    @Override
    public String toString() {
        return "menu{" +
                "PIZZE: \n" + pizze +
                "TOPPINGS: \n" + toppings +
                "BEVANDE; \n" + bevande +
                '}';
    }
}
