package com.example.patterns._02_factoryMethod;

import com.example.patterns._03_abstractFactory._02_after.Anchor;
import com.example.patterns._03_abstractFactory._02_after.Wheel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Ship {

    private String name;
    private String email;
    private String logo;

    private Anchor anchor;
    private Wheel wheel;

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
