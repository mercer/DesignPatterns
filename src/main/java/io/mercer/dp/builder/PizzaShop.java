package io.mercer.dp.builder;

public class PizzaShop {
    public Pizza order() {
        return new PizzaBuilder()
                .withCrust(new Crispy())
                .withCheese(new Parmesan())
                .withTopping(new Ham())
                .withTopping(new Tomatoes())
                .withTopping(new Bacon())
                .build();
    }
}
