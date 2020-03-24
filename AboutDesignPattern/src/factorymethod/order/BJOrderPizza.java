package factorymethod.order;

import factorymethod.pizza.BJCheesePizza;
import factorymethod.pizza.BJPepperPizza;
import factorymethod.pizza.Pizza;


public class BJOrderPizza extends OrderPizza {


	@Override
	Pizza createPizza(String orderType) {

		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new BJPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
