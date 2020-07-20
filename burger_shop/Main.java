

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Burger hamburger = new Burger("sausage","white");
//
        Meal firstMeal = new Meal(hamburger,"coke","apple pie");
        firstMeal.addSide("ice cream");
       //firstMeal.itemizeMeal();

        Order firstOrder = new Order(firstMeal);

        firstOrder.addDrink("sprite");
        firstOrder.addDrink("powerade");
        firstOrder.addSide("mixed fruit");

        firstOrder.addToppings("relish");
        firstOrder.addToppings("ketchup");
        firstOrder.purchaseOrder();

        Order secondOrder  = new Order("healthburger","white","beef");
        secondOrder.addDrink("lemonade");
        secondOrder.addSide("ice cream");
       // secondOrder.itemizeOrder();

        //Couldn't get the toppings on the right burger if the meal was already added.
        secondOrder.addBurger("deluxeburger","bacon","italian");
        secondOrder.addToppings("lettuce");
        secondOrder.addToppings("tomato");
//        secondOrder.itemizeOrder();
//        secondOrder.purchaseOrder();

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
