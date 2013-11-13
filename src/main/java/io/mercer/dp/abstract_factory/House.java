package io.mercer.dp.abstract_factory;

public abstract class House {
    Roof roof;
    Toilet toilet;
    FrontDoor frontDoor;
    HouseStyleFactory styleFactory;

    public House(HouseStyleFactory styleFactory) {
        this.styleFactory = styleFactory;
    }

    public abstract void augment();
}
