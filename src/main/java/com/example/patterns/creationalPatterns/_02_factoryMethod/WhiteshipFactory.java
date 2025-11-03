package com.example.patterns.creationalPatterns._02_factoryMethod;

public class WhiteshipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new WhiteShip();
    }
}