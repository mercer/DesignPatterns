package io.mercer.dp.abstract_factory;

public class HouseConstructionSite {
    public void construct() {
        House cottage = new CottageFactory().create();
        cottage.augment();
    }
}
