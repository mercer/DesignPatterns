package io.mercer.dp.prototype;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class PetriDishTest {
    @Test
    public void tickOnce() throws Exception {
        PetriDish dish = new PetriDish();
        dish.feed(new Cell());

        dish.tick();

        assertThat(dish.getCells()).hasSize(2);
        System.out.println(dish.getCells());
    }

    @Test
    public void tickTwice() throws Exception {
        PetriDish dish = new PetriDish();
        dish.feed(new Cell());

        dish.tick();
        dish.tick();

        assertThat(dish.getCells()).hasSize(4);
        System.out.println(dish.getCells());
    }

    @Test
    public void tickThrice() throws Exception {
        PetriDish dish = new PetriDish();
        dish.feed(new Cell());

        dish.tick();
        dish.tick();
        dish.tick();

        assertThat(dish.getCells()).hasSize(8);
        System.out.println(dish.getCells());
    }
}
