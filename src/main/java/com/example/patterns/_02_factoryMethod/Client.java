package com.example.patterns._02_factoryMethod;

public class Client {
    public static void main(String[] args) {
        Client client = new Client();

        client.print(new WhiteshipFactory(), "Whiteship", "asdf@asdf.com");
        client.print(new BlackshipFactory(), "Blackship", "asdf2@asdf.com");
    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }
}
