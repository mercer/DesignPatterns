package io.mercer.dp.abstract_factory;

public class CottageFactory extends AbstractHouseFactory {
    HouseStyleFactory styleFactory = new CottageStyleFactory();

    @Override
    public House create() {
        return new Cottage(styleFactory);
    }
}
