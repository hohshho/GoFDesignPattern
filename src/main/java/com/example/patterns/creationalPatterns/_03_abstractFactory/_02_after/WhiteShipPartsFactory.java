package com.example.patterns.creationalPatterns._03_abstractFactory._02_after;

import com.example.patterns.creationalPatterns._03_abstractFactory._01_before.WhiteAnchor;
import com.example.patterns.creationalPatterns._03_abstractFactory._01_before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory{

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}