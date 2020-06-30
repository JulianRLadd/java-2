

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Burger hamburger = new Burger("sausage","white");
        hamburger.addTopping("tomato");
        hamburger.addTopping("lettuce");
//
        Meal firstMeal = new Meal(hamburger,"coke","apple pie");
        firstMeal.addSide("fries");
       // firstMeal.addSide("ice cream");
       //firstMeal.itemizeMeal();

        Order secondOrder  = new Order(firstMeal);
        secondOrder.addDrink("lemonade");
        secondOrder.addSide("ice cream");
       // secondOrder.itemizeOrder();
        secondOrder.itemizeOrder();

//        Order firstOrder = new Order("deluxeburger","white","bacon");
//        firstOrder.addToppings("lettuce");
//        firstOrder.addToppings("ketchup");
//        firstOrder.addToppings("tomato");
//        firstOrder.addToppings("relish");
//
//        firstOrder.itemizeOrder();
//        System.out.println(        firstOrder.purchaseOrder()
//);
    }
}
