package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;

@Getter
public class Drinks extends ElementiMenu {

    private double quantità;

    public Drinks(String nome, int calorie, double prezzo, double quantità) {
        super(nome, calorie, prezzo);
        this.quantità = quantità;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "quantità=" + quantità +
                super.toString() + "} \n";
    }
}
