package com.example.patterns.creationalPatterns._03_abstractFactory._02_after;

import com.example.patterns.creationalPatterns._02_factoryMethod.Ship;
import com.example.patterns.creationalPatterns._02_factoryMethod.ShipFactory;
import com.example.patterns.creationalPatterns._02_factoryMethod.WhiteShip;

public class WhiteshipFactory implements ShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
