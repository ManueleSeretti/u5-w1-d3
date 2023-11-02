package ManueleSeretti.u5w1d1.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizze extends ElementiMenu {
    private List<String> ingredienti;

    public Pizze(String nome, List<String> ingredienti, int calorie, double prezzo) {
        super(nome, calorie, prezzo);
        this.ingredienti = ingredienti;
    }

    @Override
    public String toString() {
        return "Pizze{" +
                "ingredienti=" + ingredienti + super.toString() +
                "} \n";
    }
}
