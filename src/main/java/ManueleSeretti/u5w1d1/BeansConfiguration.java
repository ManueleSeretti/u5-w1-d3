package ManueleSeretti.u5w1d1;

import ManueleSeretti.u5w1d1.entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    Drinks getLemonated() {
        return new Drinks("limonata", 128, 1.29, 0.33);
    }

    @Bean
    Drinks getWater() {
        return new Drinks("Water", 0, 1.29, 0.5);
    }

    @Bean
    Drinks getVine() {
        return new Drinks("Vine", 607, 7.49, 0.75);
    }


    @Bean
    Toppings getCheese() {
        return new Toppings("cheese", 92, 0.69);
    }

    @Bean
    Toppings getHam() {
        return new Toppings("ham", 35, 0.99);
    }

    @Bean
    Toppings getOnion() {
        return new Toppings("Onion", 22, 0.69);
    }

    @Bean
    Toppings getPineapple() {
        return new Toppings("Pineapple", 24, 0.79);
    }

    @Bean
    Toppings getSalami() {
        return new Toppings("Salami", 86, 0.99);
    }

    @Bean
    Toppings getPomodoro() {
        return new Toppings("Pomodoro", 20, 0.49);
    }

    @Bean
    Pizze getPizzaMargherita() {
        List<String> l = new ArrayList<>(Arrays.asList(getCheese().getNome(), getPomodoro().getNome()));

        return new Pizze("Pizza Margherita", l, 1104, 4.99);

    }

    @Bean
    Pizze getPizzaHawaiian() {
        List<String> l = new ArrayList<>(Arrays.asList(getCheese().getNome(), getPomodoro().getNome(), getHam().getNome(), getPineapple().getNome()));

        return new Pizze("Pizza Hawaiian", l, 1124, 6.49);
    }

    @Bean
    Pizze getPizzaSalami() {
        List<String> l = new ArrayList<>(Arrays.asList(getCheese().getNome(), getPomodoro().getNome(), getSalami().getNome()));

        return new Pizze("Pizza Salami", l, 1160, 5.99);
    }

    @Bean
    menu getMenu() {
        List<Pizze> lp = new ArrayList<>(Arrays.asList(getPizzaMargherita(), getPizzaHawaiian(), getPizzaSalami()));
        List<Toppings> lt = new ArrayList<>(Arrays.asList(getCheese(), getHam(), getOnion(), getPineapple(), getSalami()));
        List<Drinks> ld = new ArrayList<>(Arrays.asList(getLemonated(), getWater(), getVine()));
        return new menu(lp, lt, ld);
    }

    @Bean
    List<ElementiMenu> getLista() {
        List<ElementiMenu> lista = new ArrayList<>();
        lista.add(getPizzaMargherita());
        lista.add(getPizzaMargherita());
        lista.add(getPizzaMargherita());
        lista.add(getPizzaMargherita());

        lista.add(getWater());
        lista.add(getWater());
        lista.add(getWater());
        lista.add(getWater());
        return lista;
    }
}
