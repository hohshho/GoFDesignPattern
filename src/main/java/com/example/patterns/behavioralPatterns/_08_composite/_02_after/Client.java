package com.example.patterns.behavioralPatterns._08_composite._02_after;

public class Client {

    public static void main(String[] args){
        Item doran = new Item(450, "도란검");
        Item healPotion = new Item(50, "포션");

        Bag bag = new Bag();
        bag.add(doran);
        bag.add(healPotion);

        Client client = new Client();
        client.printPrice(doran);
        client.printPrice(bag);
    }

    public void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
