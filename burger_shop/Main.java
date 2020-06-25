

public class Main {
    public static void main(String[] args) {
        //main execution of the burger shop goes here.  This is the "entry point" of your application

        Burger hamburger = new Burger("Basic", "Sausage",3.56, "White");
        double price = hamburger.itemizeHamburger();
        hamburger.addTopping1("Tomato",0.27);
        hamburger.addTopping2("Lettuce",0.75);
        hamburger.addTopping3("Cheese",1.12);
        System.out.println("Total burger price is "+ hamburger.itemizeHamburger());

        HealthBurger healthyBurger = new HealthBurger("Bacon",6.56);
        healthyBurger.addTopping1("Egg",2.27);
        healthyBurger.addTopping2("Spinach",1.75);
        System.out.println("Total healthy burger price is "+ healthyBurger.itemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();
    }
}
