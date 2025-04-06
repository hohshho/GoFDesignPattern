package creational_patterns.abstractfactory;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
