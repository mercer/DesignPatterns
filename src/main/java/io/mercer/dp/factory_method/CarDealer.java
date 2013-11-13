package io.mercer.dp.factory_method;

public class CarDealer {

    public void purchase() {
        Car ferrari = new FerrariShop().create();
    }
}
