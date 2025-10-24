package com.example.patterns._03_abstractFactory._01_before;

import com.example.patterns._02_factoryMethod.Ship;
import com.example.patterns._02_factoryMethod.ShipFactory;

public class WhiteshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        Ship ship = new Ship();
        ship.setName("whiteship");
        ship.setEmail("whiteship@gmail.com");
        return ship;
    }
}
