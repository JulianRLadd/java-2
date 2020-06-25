

public class DeluxeBurger extends Burger{
    public DeluxeBurger(){
        super("Deluxe","Sausage & Bacon",8.96,"White");
        super.addTopping1("Chips",2.75);
        super.addTopping2("Drink",1.81);
    }

    @Override
    public void addTopping1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTopping2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTopping3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addTopping4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
