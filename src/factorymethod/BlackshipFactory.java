package factorymethod;

public class BlackshipFactory implements ShipFactory{
    @Override
    public void sendEmailTo(String email, Ship ship) {

    }

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
