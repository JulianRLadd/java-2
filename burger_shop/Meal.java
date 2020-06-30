

public class Meal {
    private Burger hamburger;
    private Drink drink;
    private Side side;
    private Side side2;
    private Side side3;


    public Meal(Burger hamburger,String drink, String side){
        this.hamburger = hamburger;
        this.drink = new Drink(drink);
        this.side = new Side(side);
    }

    public Meal(){
        this.hamburger = new Burger("Beef","White");
        this.drink = new Drink("Coke");
        this.side = new Side("Fries");
    }

    public Burger getBurger(){
        return this.hamburger;
    }
     public Side getSide2(){
        return this.side2;
    }
     public Side getSide3(){
        return this.side3;
    }


//    public double itemizeMeal(){
//        double sum = drink.getPrice()+side.getPrice()+ hamburger.getPrice();
//        return sum;
//    }

    public void addSide(String side){
        if(side2 ==null){
            side2 = new Side(side);
        }else if(side3==null){
            side3 = new Side(side);
        }else{
            throw new Error("Meals can only have 3 sides");
        }
    }

    public void addTopping(String topping){

    }

    public double getPrice(){
        double mealPrice = drink.getPrice()+side.getPrice()+ hamburger.getPrice();

        System.out.println("You have a drink of "+this.drink.getName()+" for "+this.drink.getPrice()+".");
        System.out.println("You have a side of "+this.side.getName()+" for "+this.side.getPrice()+".");

        if(this.side2 !=null){
            System.out.println("You have a side of "+this.side2.getName()+" for "+this.side2.getPrice()+".");
            mealPrice+=side2.getPrice();
        }
        if(this.side3!=null){
            System.out.println("You have a side of "+this.side3.getName()+" for "+this.side3.getPrice()+".");
            mealPrice+=side3.getPrice();
        }
        System.out.println("Your meal total is "+mealPrice+".");
        return mealPrice;
    }

    public double itemizeMeal(){
        System.out.println("This "+this.getClass().getSimpleName()+" consists of: ");
        System.out.println("***************BURGER CLASS****************");
        this.hamburger.itemizeHamburger();
        System.out.println("***************BURGER CLASS****************");

        double mealPrice =this.getPrice();
//        if(this.hamburger.selectedToppings != null) {
//            for (String i : selectedToppings.keySet()) {
//                System.out.println("Added " + i + " for an extra " + this.selectedToppings.get(i));
//                burgerPrice+=selectedToppings.get(i);
//            }
//        }

        return mealPrice;
    }
}
