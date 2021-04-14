
/** "Director" */
public class Cocina {
	private PizzaBuilder pizzaBuilder;
	
	public void setPizzaBuilder(PizzaBuilder pb) { pizzaBuilder = pb; }
	public Pizza getPizza() { return pizzaBuilder.getPizza(); }
	
	public void construirPizza() {
		pizzaBuilder.buildMasa();
		pizzaBuilder.buildSalsa();
		pizzaBuilder.buildRelleno();
	}
}

/** Un cliente pidiendo una pizza. */
class BuilderExample {
	public static void main(String[] args) {
		Cocina cocina = new Cocina();
		PizzaBuilder hawai_pizzaBuilder = new HawaiPizzaBuilder();
		PizzaBuilder picante_pizzaBuilder = new PicantePizzaBuilder();
		
		cocina.setPizzaBuilder(hawai_pizzaBuilder);
		cocina.construirPizza();
		
		Pizza pizza = cocina.getPizza();
	}
}
