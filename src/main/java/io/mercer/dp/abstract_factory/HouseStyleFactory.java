package io.mercer.dp.abstract_factory;

public abstract class HouseStyleFactory {
    public abstract Roof createRoof();
    public abstract Toilet createToilet();
    public abstract FrontDoor createFrontDoor();
}
