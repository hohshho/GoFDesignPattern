package com.example.patterns.creationalPatterns._03_abstractFactory._02_after;

public interface ShipPartsFactory {
    Anchor createAnchor();
    Wheel createWheel();
}
