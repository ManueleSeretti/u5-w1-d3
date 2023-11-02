package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;

@Getter
public class Toppings extends ElementiMenu {

    public Toppings(String nome, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
    }

    @Override
    public String toString() {
        return "Toppings{ " + super.toString() + " } \n";
    }
}
