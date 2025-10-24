package com.example.patterns._03_abstractFactory._02_after;

import com.example.patterns._02_factoryMethod.Ship;
import com.example.patterns._02_factoryMethod.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory whiteShipFactory = new WhiteshipFactory(new WhiteShipPartsFactory());
        Ship ship = whiteShipFactory.createShip();
        System.out.println("ship.getAnchor().getClass() = " + ship.getAnchor().getClass());
        System.out.println("ship.getWheel().getClass() = " + ship.getWheel().getClass());

    }
}
