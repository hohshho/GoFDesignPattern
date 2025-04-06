package creational_patterns.factorymethod.ex;

import creational_patterns.factorymethod.BlackShip;
import creational_patterns.factorymethod.Whiteship;

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
