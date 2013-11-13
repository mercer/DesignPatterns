package io.mercer.dp.abstract_factory;

public class Cottage extends House {
    public Cottage(HouseStyleFactory styleFactory) {
        super(styleFactory);
    }

    @Override
    public void augment() {
        frontDoor = styleFactory.createFrontDoor();
        roof = styleFactory.createRoof();
        toilet = styleFactory.createToilet();
    }
}
