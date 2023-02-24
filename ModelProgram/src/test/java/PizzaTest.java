import org.junit.Test;
import org.lyx.factory.SimplePizzaFactory;
import org.lyx.model.Pizza;

public class PizzaTest {
    @Test
    public void orderPizza() {
        String type = "chess";
        Pizza pizza = SimplePizzaFactory.getPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }
    }
}
