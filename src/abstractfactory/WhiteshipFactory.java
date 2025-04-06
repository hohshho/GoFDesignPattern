package abstractfactory;

import factorymethod.DefaultShipFactory;
import factorymethod.Ship;
import factorymethod.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory){
        this.shipPartsFactory = shipPartsFactory;
    }
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}