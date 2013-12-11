package io.mercer.dp.adapter;

import org.junit.Test;

public class BicycleAdapterTest {

    @Test
    public void weHaveACar() {
        Client client = new Client(new Ferrari());
        client.perform();
    }

    @Test
    public void weOnlyHaveABicycle() {
        Client client = new Client(new BicycleAdapter(new Pegas()));
        client.perform();
    }

}
