package org.lyx.factory;

import org.jetbrains.annotations.NotNull;
import org.lyx.model.CheessPizza;
import org.lyx.model.Pizza;
import org.lyx.model.VegglePizza;

public class SimplePizzaFactory {
    public static Pizza getPizza(@NotNull String name){
        Pizza pizza = null;
        if(name.equals("chess")){
            pizza = new CheessPizza("chess");
        }else if(name.equals("veggle")) {
            pizza = new VegglePizza("veggle");
        }
        return pizza;
    }
}
