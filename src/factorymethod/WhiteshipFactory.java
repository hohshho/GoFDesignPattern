package factorymethod;

public class WhiteshipFactory implements ShipFactory{

    @Override
    public void sendEmailTo(String email, Ship ship) {

    }

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
