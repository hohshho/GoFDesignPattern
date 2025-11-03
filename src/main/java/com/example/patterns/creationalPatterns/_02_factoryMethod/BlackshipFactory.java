package com.example.patterns.creationalPatterns._02_factoryMethod;

public class BlackshipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
