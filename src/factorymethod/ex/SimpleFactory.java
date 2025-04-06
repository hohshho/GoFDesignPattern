package factorymethod.ex;

import factorymethod.BlackShip;
import factorymethod.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name){
        if(name.equals("whiteship")) {
            return new Whiteship();
        } else if(name.equals("blackship")) {
            return new BlackShip();
        }

        throw new IllegalArgumentException();
    }
}
