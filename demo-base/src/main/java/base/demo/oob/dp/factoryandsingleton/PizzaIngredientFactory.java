package base.demo.oob.dp.factoryandsingleton;

import base.demo.oob.dp.factoryandsingleton.pojo.Cheese;
import base.demo.oob.dp.factoryandsingleton.pojo.Clam;
import base.demo.oob.dp.factoryandsingleton.pojo.Pepperoni;

public interface PizzaIngredientFactory {

    Cheese createCheese();
    Clam createClam();
    Pepperoni createPepperoni();
}
