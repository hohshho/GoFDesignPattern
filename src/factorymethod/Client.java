package factorymethod;

public class Client {

    public static void main(String[] args){
        Client client = new Client();

//        Ship whiteShip = new WhiteshipFactory().orderShip("Whiteship", "asdf@asdf.com");
//        System.out.println(whiteShip);

//        Ship blackship = new BlackshipFactory().orderShip("Blackship", "asdf2@asdf.com");
//        System.out.println(blackship);

        client.print(new WhiteshipFactory(), "Whiteship", "asdf@asdf.com");
        client.print(new BlackshipFactory(), "Blackship", "asdf2@asdf.com");
    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name, email));
    }
}
