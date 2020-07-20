import java.util.ArrayList;

public class Order {
    private Meal meal;
    private Meat meat;
    private Burger burger;
    private Bread bread;
    private Side side;
    private Drink drink;

    private ArrayList<Burger> burgerOrders = new ArrayList<Burger>();
    private ArrayList<Drink> drinkOrders = new ArrayList<Drink>();
    private ArrayList<Side> sideOrders = new ArrayList<Side>();


    public Order(Meal meal){
        this.meal = meal;
    }

    public Order(String burger, String bread, String meat){
        if (burger.toUpperCase().equals("DELUXEBURGER")) {
            this.burgerOrders.add(new DeluxeBurger(meat,bread));
        }else if(burger.toUpperCase().equals("HEALTHBURGER")){
            this.burgerOrders.add(new HealthBurger(meat));
        } else{
            this.burgerOrders.add(new Burger(meat,bread));
        }
    }

    public void addToppings(String topping){
        if(this.meal ==null){
            this.burgerOrders.get(this.burgerOrders.size()-1).addTopping(topping);
        }else{
            this.meal.getBurger().addTopping(topping);
        }
    }

    public void addDrink(String drink){
            this.drinkOrders.add(new Drink(drink));
    }

    public void addSide(String side){
        if(this.meal != null&&this.meal.getSide3() != null){
            this.meal.addSide(side);
        }else{
            this.sideOrders.add(new Side(side));
        }
    }

    public void addBurger(String burger,String meat, String bread){
            if (burger.toUpperCase().equals("DELUXEBURGER")) {
                this.burgerOrders.add(new DeluxeBurger(meat,bread));
            }else if(burger.toUpperCase().equals("HEALTHBURGER")){
                this.burgerOrders.add(new HealthBurger(meat));
            } else{
                this.burgerOrders.add(new Burger(meat,bread));
            }

    }

    public double itemizeOrder(){
        double orderPrice = 0;
        System.out.println("This "+this.getClass().getSimpleName()+" consists of: ");
        System.out.println("***************MEAL CLASS****************");
        if(this.meal != null){
            orderPrice = this.meal.itemizeMeal();
        }
        System.out.println("***************MEAL CLASS****************");

        return orderPrice;
    }

    private void resetOrder(){
        this.meal = null;
        burgerOrders = new ArrayList<Burger>();
       drinkOrders = new ArrayList<Drink>();
        sideOrders = new ArrayList<Side>();
           }


    public double purchaseOrder(){
        double orderSum= this.itemizeOrder();
        System.out.println("You also bought:");
        for(int i =0;i<this.burgerOrders.size();i++){
            System.out.println(this.burgerOrders.get(i).getClass().getSimpleName());
            System.out.println(this.burgerOrders.get(i).getPrice());
            orderSum+=this.burgerOrders.get(i).getPrice();
        }
         for(int i =0;i<this.sideOrders.size();i++){
             System.out.println(this.sideOrders.get(i).getName());
             System.out.println(this.sideOrders.get(i).getPrice());
             orderSum+=this.sideOrders.get(i).getPrice();
        }
         for(int i =0;i<this.drinkOrders.size();i++){
             System.out.println(this.drinkOrders.get(i).getName());
             System.out.println(this.drinkOrders.get(i).getPrice());
             orderSum+=this.drinkOrders.get(i).getPrice();
        }
        System.out.println("****************PURCHASE ORDER*************************");
        System.out.println("Your total is "+orderSum);
        System.out.println("Thank you for your purchase!!");
        this.resetOrder();
        return orderSum;
    }

}
