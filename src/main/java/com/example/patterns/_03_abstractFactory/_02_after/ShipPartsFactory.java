package com.example.patterns._03_abstractFactory._02_after;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
