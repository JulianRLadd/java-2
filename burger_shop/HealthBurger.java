import java.util.HashMap;

public class HealthBurger extends Burger {

    final protected HashMap<String,Double> healthyToppings = new HashMap<String,Double>(){
        {
            put("lettuce",0.67);
            put("tomatoes",0.49);
            put("mustard",0.15);
            put("ketchup",0.22);
        }
    };
    public HealthBurger(String meat) {
        super(meat, "Rye");
        if(meat.toLowerCase().equals("bacon")||meat.toLowerCase().equals("sausage")){
            throw new Error("Only healthy meats on the healthy burger.");
        }
    }


    @Override
    public void addTopping(String name) {
        if (selectedToppings.size() < 4) {
            this.selectedToppings.put(name.toLowerCase(), healthyToppings.get(name));
        } else {
            throw new Error("Only four toppings are allowed on the health burger.(And they must be healthy!)");
        }
    }

}
