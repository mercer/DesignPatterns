package io.mercer.dp.builder;

import com.google.common.collect.Lists;

public class PizzaBuilder {
    private Pizza instance;

    public PizzaBuilder() {
        instance = new Pizza();
        instance.toppings = Lists.newArrayList();
    }

    public Pizza build() {
        return instance;
    }

    public PizzaBuilder withCrust(Crust crust) {
        instance.crust = crust;
        return this;
    }

    public PizzaBuilder withCheese(Cheese cheese) {
        instance.cheese = cheese;
        return this;
    }

    public PizzaBuilder withTopping(Topping topping) {
        instance.toppings.add(topping);
        return this;
    }
}
