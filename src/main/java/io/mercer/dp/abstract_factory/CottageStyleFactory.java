package io.mercer.dp.abstract_factory;

public class CottageStyleFactory extends HouseStyleFactory {
    @Override
    public Roof createRoof() {
        return new StrawRoof();
    }

    @Override
    public Toilet createToilet() {
        return new CountryToilet();
    }

    @Override
    public FrontDoor createFrontDoor() {
        return new WoodDoor();
    }
}
