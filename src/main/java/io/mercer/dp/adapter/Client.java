package io.mercer.dp.adapter;

public class Client {

    private Car car;

    public Client(Car car) {

        this.car = car;
    }

    public void perform(){
        car.drive();
    }
}
