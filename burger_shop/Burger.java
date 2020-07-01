import java.util.HashMap;

public class Burger {
    private Meat meat;
    private double price;
    private double originalPrice;
    private Bread bread;
    protected HashMap<String,Double> selectedToppings = new HashMap<String,Double>();
    final protected HashMap<String,Double> toppings = new HashMap<String,Double>(){
        {
            put("lettuce",0.67);
            put("tomato",0.49);
            put("mustard",0.15);
            put("ketchup",0.25);
            put("relish",1.19);
            put("cheese",0.89);
            put("mayo",0.19);

        }
    };

    public Burger(String meat, String bread) {
        this.meat = new Meat(meat);
        this.price = 4.79;
        this.bread = new Bread(bread);
        this.originalPrice = price;
    }


    public void addTopping(String name){
        if(selectedToppings.size()<2){
            this.selectedToppings.put(name.toLowerCase(),toppings.get(name));
            addPrice(this.selectedToppings.get(name));
        } else{
            throw new Error("Only two toppings are allowed on the basic burger!");
        }
    }

    public Burger getBurger(){
        return this;
    }

    public double addPrice(double additionPrice){
        this.price+=additionPrice;
        return this.price;
    }

    public void totalBurgerPrice(){
        System.out.println("Total price of this burger is "+this.price);
    }

    public void plainBurgerPrice(){
        System.out.println("Price of plain burger is "+this.originalPrice);
    }

    public double getPrice(){
        return this.price;
    }
    public double setPrice(double newPrice){
        this.price = newPrice;
        return this.price;
    }


    public double itemizeHamburger(){
        double burgerPrice =this.price;
        System.out.println("The "+this.getClass().getSimpleName()+" on a "+this.bread.getBread()+ " roll with "+this.meat.getMeat()+".");
        System.out.println("The price is "+this.price);
        if(this.selectedToppings != null) {
            for (String i : selectedToppings.keySet()) {
                System.out.println("Added " + i + " for an extra " + this.selectedToppings.get(i));
            }
        }
        totalBurgerPrice();

        return this.price;
    }
}
