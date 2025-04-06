package factorymethod;

import abstractfactory.Anchor;
import abstractfactory.Wheel;

public class Ship {

    private String name;

    private String color;

    private String logo;

    private Wheel wheel;

    private Anchor anchor;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo){
        this.logo = logo;
    }

    public Anchor getAnchor() {
        return this.anchor;
    }

    public Wheel getWheel() {
        return this.wheel;
    }
    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
