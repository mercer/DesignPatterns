package io.mercer.dp.factory_method;

public class FerrariShop extends CarShop {
    @Override
    public Car create() {
        return new Ferrari();
    }
}
