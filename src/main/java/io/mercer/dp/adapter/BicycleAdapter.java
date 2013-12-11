package io.mercer.dp.adapter;

public class BicycleAdapter implements Car {
    private Bicycle bicycle;

    public BicycleAdapter(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void drive() {
        bicycle.pedal();
    }
}
