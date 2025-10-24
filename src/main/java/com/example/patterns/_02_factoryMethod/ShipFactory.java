package com.example.patterns._02_factoryMethod;

public interface ShipFactory {

    default Ship orderShip(String name, String email) {
        validate(name, email);

        prepareFor(name);

        Ship ship = createShip();

        sendEmailTo(email, ship);

        return ship;
    }

    private void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 완성되었습니다.");
    }

    Ship createShip();

    private void validate(String name, String email) {
        if(name == null || name.isBlank()) {
            throw new IllegalArgumentException("name is null or blank");
        }
        if(email == null || email.isBlank()) {
            throw new IllegalArgumentException("email is null or blank");
        }
    }
    
    private void prepareFor(String name){
        System.out.println(name + " 만들 준비 중");
    }
}
