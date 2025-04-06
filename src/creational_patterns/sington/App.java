package creational_patterns.sington;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class App {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Settings settings = Settings.INSTANCE;

        Settings settings1 = null;
        Constructor<?>[] declaredConstructors = Settings.class.getDeclaredConstructors();
        for(Constructor<?> constructor : declaredConstructors){
            constructor.setAccessible(true);
            settings1 = (Settings) constructor.newInstance("INSTANCE");
        }

        System.out.println(settings1 == settings);
    }
}

